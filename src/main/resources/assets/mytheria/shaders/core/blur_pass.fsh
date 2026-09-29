#version 150

in vec2 TexCoord;
in vec4 FragColor;

uniform sampler2D Sampler0;
uniform vec2 Direction; // ось прохода: (1, 0) или (0, 1), уже нормализована
uniform vec2 TexelSize; // размер текселя источника
uniform float Radius; // радиус ядра в текселях источника

out vec4 OutColor;

// Пар выборок; каждая берёт два соседних текселя одним билинейным чтением,
// поэтому ядро покрывает 2 * PAIR_COUNT текселей подряд, без пропусков и полос.
// Оба прохода идут в половине разрешения, шестнадцать пар покрывают радиус до 32 текселей.
const int PAIR_COUNT = 16;

// Выборка за пределами кадра тянет края и даёт полосы, поэтому uv зажимается.
vec2 clampUv(vec2 uv) {
    return clamp(uv, TexelSize * 0.5, 1.0 - TexelSize * 0.5);
}

void main() {
    float radius = max(Radius, 1.0);
    float sigma = max(radius * 0.5, 1.0);
    // Показатель гауссианы сводится к одному умножению на кадр, а не к делению на выборку.
    float falloff = -1.0 / (2.0 * sigma * sigma);
    vec2 texelStep = Direction * TexelSize;

    float weightSum = 1.0;
    vec3 accum = texture(Sampler0, clampUv(TexCoord)).rgb;

    for (int index = 0; index < PAIR_COUNT; index++) {
        float near = float(index * 2 + 1);
        float far = near + 1.0;

        if (near > radius) {
            break;
        }

        float nearWeight = exp(near * near * falloff);
        float farWeight = far > radius ? 0.0 : exp(far * far * falloff);
        float pairWeight = nearWeight + farWeight;

        if (pairWeight <= 0.0001) {
            break;
        }

        // Смещение между двумя текселями по их весам: одно чтение вместо двух.
        float offset = (near * nearWeight + far * farWeight) / pairWeight;
        vec2 delta = texelStep * offset;

        accum += texture(Sampler0, clampUv(TexCoord + delta)).rgb * pairWeight;
        accum += texture(Sampler0, clampUv(TexCoord - delta)).rgb * pairWeight;
        weightSum += pairWeight * 2.0;
    }

    OutColor = vec4(accum / weightSum, 1.0) * FragColor;
}
