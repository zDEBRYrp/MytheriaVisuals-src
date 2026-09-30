#version 150

in vec2 TexCoord;
in vec4 FragColor;

uniform sampler2D Sampler0; // размытый кадр
uniform sampler2D Sampler1; // руки, отрисованные отдельно на прозрачном фоне
uniform vec4 Tint;          // rgb - цвет, a - сила окраски

out vec4 OutColor;

void main() {
    float mask = texture(Sampler1, TexCoord).a;

    if (mask <= 0.001) {
        discard;
    }

    vec3 blurred = texture(Sampler0, TexCoord).rgb;

    OutColor = vec4(mix(blurred, Tint.rgb, Tint.a), mask);
}
