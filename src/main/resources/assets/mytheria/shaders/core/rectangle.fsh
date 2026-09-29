#version 150

#moj_import <mytheria:shape.glsl>

in vec2 LocalPx; // координаты фрагмента внутри фигуры, в пикселях
flat in vec2 SizePx;
flat in float RadiusPx;
flat in float Smoothness;
in vec4 FragColor;

out vec4 OutColor;

void main() {
    float alpha = ralpha1(SizePx, LocalPx, RadiusPx, Smoothness);

    OutColor = vec4(FragColor.rgb, FragColor.a * alpha);
}
