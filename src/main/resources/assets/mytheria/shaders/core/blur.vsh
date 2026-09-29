#version 150

#moj_import <mytheria:shape_attributes.glsl>

in vec3 Position;
in vec4 Color;
in vec2 UV0;   // координаты фрагмента внутри фигуры, в пикселях
in ivec2 UV1;  // размер фигуры
in ivec2 UV2;  // x: радиус со знаком-флагом сглаживания

uniform mat4 ModelViewMat;
uniform mat4 ProjMat;

out vec2 LocalPx;
out vec2 TexCoord;
flat out vec2 SizePx;
flat out float RadiusPx;
flat out float Smoothness;
out vec4 FragColor;

void main() {
    gl_Position = ProjMat * ModelViewMat * vec4(Position, 1.0);

    LocalPx = UV0;
    TexCoord = gl_Position.xy * 0.5 + 0.5;
    SizePx = sunpacksize(UV1);
    RadiusPx = sunpackradius(UV2.x);
    Smoothness = sunpacksmoothness(UV2.x);
    FragColor = Color;
}
