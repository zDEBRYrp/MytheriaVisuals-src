#version 150

#moj_import <mytheria:common.glsl>
#moj_import <mytheria:shape_attributes.glsl>

in vec3 Position;
in vec4 Color;
in vec2 UV0;   // разметка текстуры
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

    SizePx = sunpacksize(UV1);
    // UV0 занят разметкой текстуры, поэтому угол квада берётся из порядка вершин.
    LocalPx = rvertexcoord(gl_VertexID) * SizePx;
    TexCoord = UV0;
    RadiusPx = sunpackradius(UV2.x);
    Smoothness = sunpacksmoothness(UV2.x);
    FragColor = Color;
}
