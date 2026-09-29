#version 150

uniform float uTime;
uniform vec2 uResolution;
uniform float uFov;
uniform vec3 uCamRight;
uniform vec3 uCamUp;

out vec4 fragColor;

float hash21(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

void main() {
    vec3 right = normalize(uCamRight);
    vec3 up = normalize(uCamUp);
    vec3 forward = -cross(right, up);

    float tanFov = tan(radians(uFov) * 0.5);
    vec2 ndc = gl_FragCoord.xy / uResolution * 2.0 - 1.0;
    vec3 ray = normalize(forward + right * ndc.x * tanFov * uResolution.x / uResolution.y
            + up * ndc.y * tanFov);

    float elevation = asin(clamp(ray.y, -1.0, 1.0));
    float u = atan(ray.x, -ray.z) * (0.5 / 3.14159265) + 0.5;
    float v = elevation * (1.0 / 3.14159265) + 0.5;
    float time = uTime;

    float horizon = smoothstep(-0.10, 0.34, ray.y);
    vec3 color = mix(vec3(0.012, 0.008, 0.035), vec3(0.006, 0.012, 0.060), horizon);
    color += vec3(0.012, 0.004, 0.025) * exp(-abs(ray.y - 0.08) * 9.0);

    vec2 starGrid = vec2(u * 240.0, v * 120.0);
    vec2 starCell = floor(starGrid);
    vec2 starLocal = fract(starGrid) - 0.5;
    float starSeed = hash21(starCell);
    float starShape = 1.0 - smoothstep(0.015, 0.055, length(starLocal));
    float twinkle = 0.55 + 0.45 * sin(time * (0.7 + starSeed) + starSeed * 6.2831853);
    float stars = step(0.997, starSeed) * starShape * smoothstep(0.50, 0.72, v) * twinkle;
    color += vec3(0.60, 0.72, 1.0) * stars * 0.75;

    float arc = u * 6.2831853;
    float topA = 0.69 + 0.10 * sin(arc * 2.0 + time * 0.16)
            + 0.045 * sin(arc * 5.0 - time * 0.11);
    float curtainA = smoothstep(0.49, 0.57, v) * (1.0 - smoothstep(topA, topA + 0.09, v));
    float foldsA = 0.5 + 0.5 * sin(arc * 38.0 + 3.0 * sin(arc * 2.0 + time * 0.18)
            + v * 5.0 - time * 0.32);
    float bladesA = 0.25 + 0.75 * pow(foldsA, 3.0);

    float topB = 0.60 + 0.08 * sin(arc * 1.5 - time * 0.13 + 1.7)
            + 0.035 * sin(arc * 4.0 + time * 0.09);
    float curtainB = smoothstep(0.47, 0.56, v) * (1.0 - smoothstep(topB, topB + 0.08, v));
    float foldsB = 0.5 + 0.5 * sin(arc * 27.0 + 2.5 * sin(arc * 3.0 - time * 0.14)
            - v * 7.0 + time * 0.23);
    float bladesB = 0.2 + 0.8 * pow(foldsB, 4.0);

    float colorWave = 0.5 + 0.5 * sin(arc * 0.8 + time * 0.12 + v * 3.0);
    vec3 teal = vec3(0.055, 0.88, 0.57);
    vec3 violet = vec3(0.48, 0.12, 0.94);
    vec3 cyan = vec3(0.12, 0.52, 1.0);
    vec3 auroraA = mix(teal, violet, colorWave);
    vec3 auroraB = mix(cyan, vec3(0.95, 0.24, 0.68), 0.5 + 0.5 * sin(arc * 0.65 - time * 0.10));

    float pulse = 0.86 + 0.14 * sin(time * 0.75 + arc * 1.3);
    color += auroraA * curtainA * bladesA * pulse * 0.82;
    color += auroraB * curtainB * bladesB * pulse * 0.48;
    color += mix(teal, violet, colorWave) * curtainA * 0.10;

    fragColor = vec4(clamp(color, 0.0, 1.0), 1.0);
}
