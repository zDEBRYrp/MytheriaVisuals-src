#version 150

#moj_import <mytheria:shape.glsl>

in vec2 LocalPx;
in vec2 TexCoord;
flat in vec2 SizePx;
flat in float RadiusPx;
flat in float Smoothness;
in vec4 FragColor;

uniform sampler2D Sampler0;

out vec4 OutColor;

void main() {
    float alpha = ralpha1(SizePx, LocalPx, RadiusPx, Smoothness);
    vec4 color = vec4(1.0, 1.0, 1.0, alpha) * texture(Sampler0, TexCoord) * FragColor;

    if (color.a == 0.0) { // alpha test
        discard;
    }

    OutColor = color;
}
