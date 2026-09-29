#version 150

in vec2 TexCoord;

uniform sampler2D Sampler0; // кадр в полном разрешении
uniform vec2 TexelSize; // размер текселя источника

out vec4 OutColor;

// Прореживание кадра: четыре билинейных выборки вокруг центра усредняют блок 4x4,
// что при шаге 2 -> 1 даёт мягкое сглаживание без алиасинга.
void main() {
    vec2 offset = TexelSize;
    vec2 uv = clamp(TexCoord, TexelSize * 2.0, 1.0 - TexelSize * 2.0);

    vec3 accum = texture(Sampler0, uv + vec2(-offset.x, -offset.y)).rgb;
    accum += texture(Sampler0, uv + vec2(offset.x, -offset.y)).rgb;
    accum += texture(Sampler0, uv + vec2(-offset.x, offset.y)).rgb;
    accum += texture(Sampler0, uv + vec2(offset.x, offset.y)).rgb;

    OutColor = vec4(accum * 0.25, 1.0);
}
