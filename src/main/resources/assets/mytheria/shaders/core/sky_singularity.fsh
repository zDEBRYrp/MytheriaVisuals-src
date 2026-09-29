#version 150

// «Сингулярность». Оригинал рисовался в экранных координатах; здесь луч камеры
// переводится в систему объекта, чтобы он висел в одной точке неба.

uniform float uTime;
uniform vec2  uResolution;
uniform float uFov;
uniform vec3  uCamRight;
uniform vec3  uCamUp;
uniform vec3  uDir;

out vec4 fragColor;

void main() {
    vec3 right = normalize(uCamRight);
    vec3 up = normalize(uCamUp);
    vec3 forward = -cross(right, up);

    float tanV = tan(radians(uFov) * 0.5);
    vec2 ndc = gl_FragCoord.xy / uResolution * 2.0 - 1.0;
    vec3 ray = normalize(forward + right * ndc.x * tanV * uResolution.x / uResolution.y + up * ndc.y * tanV);

    // Система объекта: он лежит по -Z, как в оригинале камера смотрела на него.
    vec3 Z = -normalize(uDir);
    vec3 Y = vec3(0.0, 1.0, 0.0) - Z * Z.y;
    Y = dot(Y, Y) < 1.0e-4 ? vec3(0.0, 0.0, 1.0) : normalize(Y);
    vec3 X = cross(Y, Z);

    vec3 d = vec3(dot(ray, X), dot(ray, Y), dot(ray, Z));

    // Экранная координата оригинала — для виньетки вокруг объекта.
    vec2 u = d.z < -1.0e-3 ? d.xy / (-d.z) * 1.65 : vec2(1.0e3);

    float t = uTime;
    float z = 0.05;
    float r = 0.0;
    float g = 0.0;
    float k = 0.0;
    vec3 p;
    vec3 q;
    vec3 color = vec3(0.0);

    for (int i = 0; i < 110 && z < 10.0; i++) {
        p = d * z;
        p.z += 4.2;
        q = p;
        float warpTime = t * 0.8;

        // Fixed octave count lets the GLSL compiler unroll this hot inner loop.
        q += sin(q.yzx + warpTime + vec3(0.0, 2.0, 4.0)) * 0.24;
        q += sin(q.yzx * 2.0 + warpTime + vec3(0.0, 2.0, 4.0)) * 0.12;
        q += sin(q.yzx * 4.0 + warpTime + vec3(0.0, 2.0, 4.0)) * 0.06;
        q += sin(q.yzx * 8.0 + warpTime + vec3(0.0, 2.0, 4.0)) * 0.03;

        r = length(p);
        g = dot(sin(q * 1.25), cos(q.yzx * 1.15));
        k = 4.0 * (0.7 * p.z + 0.35 * p.x) / r;

        color += (0.5 + 0.5 * cos(g * 7.0 + sin(q.x * 2.0 + q.y * 3.0 - 2.0 * t + r * 4.0) + t + vec3(k, 1.5, 4.0 - k)))
                * (exp(-6.5 * abs(g)) * (0.35 + 1.2 * exp(-2.5 * abs(r - 1.65))) + 0.15 * exp(-2.2 * r))
                * exp(-0.18 * z) * 0.035;

        z += 0.045 * (1.0 + abs(g));
    }

    fragColor = vec4((1.0 - exp(-2.0 * color)) * (0.35 + 1.55 * smoothstep(1.4, 0.2, length(u))), 1.0);
}
