#version 150

#moj_import <mytheria:shape.glsl>

in vec2 LocalPx; // координаты фрагмента внутри фигуры, в пикселях
flat in vec2 SizePx;
flat in float RadiusPx;
flat in float Smoothness;
flat in float Thickness;
in vec4 FragColor;

out vec4 OutColor;

void main() {
    // Обводка внутренняя (StrokeStyle.Align.INSIDE у Aero): внешний контур — сама форма,
    // внутренний — она же, ужатая на толщину со всех сторон.
    float outerDistance = rdist1(LocalPx, SizePx, RadiusPx);

    vec2 innerSize = max(SizePx - vec2(Thickness * 2.0), vec2(0.0));
    float innerRadius = max(RadiusPx - Thickness, 0.0);
    float innerDistance = rdist1(LocalPx - vec2(Thickness), innerSize, innerRadius);

    float outerSoftness = rsoftness(outerDistance, Smoothness);
    float innerSoftness = rsoftness(innerDistance, Smoothness);

    float outerMask = 1.0 - smoothstep(-outerSoftness, outerSoftness, outerDistance);
    float innerMask = 1.0 - smoothstep(-innerSoftness, innerSoftness, innerDistance);
    float strokeMask = clamp(outerMask - innerMask, 0.0, 1.0);

    OutColor = vec4(FragColor.rgb, FragColor.a * strokeMask);
}
