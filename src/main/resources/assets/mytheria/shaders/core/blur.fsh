#version 150

#moj_import <mytheria:shape.glsl>

in vec2 LocalPx; // координаты фрагмента внутри фигуры, в пикселях
in vec2 TexCoord;
flat in vec2 SizePx;
flat in float RadiusPx;
flat in float Smoothness;
in vec4 FragColor; // цвет подложки: rgb - тинт, a - насколько он подмешан

uniform sampler2D Sampler0; // уже размытая копия кадра
uniform float Saturation;
uniform float Intensity;

out vec4 OutColor;

void main() {
    vec2 texel = 1.0 / vec2(textureSize(Sampler0, 0));
    vec2 uv = clamp(TexCoord, texel * 0.5, 1.0 - texel * 0.5);

    vec3 blurred = texture(Sampler0, uv).rgb;

    float luma = dot(blurred, vec3(0.2126, 0.7152, 0.0722));
    blurred = mix(vec3(luma), blurred, Saturation) * (1.0 + Intensity);

    // Честное смешение как в backdrop_blur Aero: альфа цвета - доля тинта,
    // а не прозрачность панели, поэтому размытие остаётся видимым.
    vec3 tinted = mix(blurred, FragColor.rgb, clamp(FragColor.a, 0.0, 1.0));

    float dist = rdist1(LocalPx, SizePx, RadiusPx);
    float softness = rsoftness(dist, Smoothness);
    float mask = 1.0 - smoothstep(-softness, softness, dist);

    if (mask <= 0.001) {
        discard;
    }

    OutColor = vec4(tinted, mask);
}
