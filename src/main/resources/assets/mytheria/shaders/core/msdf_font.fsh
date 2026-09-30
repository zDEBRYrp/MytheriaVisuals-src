#version 150

in vec2 TexCoord;
in vec4 FragColor;

uniform sampler2D Sampler0;
uniform float Range; // distance field range of the msdf font texture
uniform float Thickness; // сдвиг порога: > 0 - жирнее
uniform float Smoothness; // множитель мягкости края
uniform bool Outline;
uniform float OutlineThickness;
uniform vec4 OutlineColor;

out vec4 OutColor;

// Значения по умолчанию из Aero (TextQuadDrawData).
const float EDGE_SOFTNESS_PX = 0.72;
const float SHARPNESS = 1.12;

float median(vec3 color) {
    return max(min(color.r, color.g), min(max(color.r, color.g), color.b));
}

// Сколько экранных пикселей занимает единица поля расстояний в этом фрагменте.
float screenPxRange() {
    vec2 unitRange = vec2(Range) / vec2(textureSize(Sampler0, 0));
    vec2 screenTexel = max(vec2(1.0) / fwidth(TexCoord), vec2(1.0));

    return max(0.5 * dot(unitRange, screenTexel), 1.0) * SHARPNESS;
}

float coverage(float distance, float threshold, float pxRange, float softness) {
    float alpha = smoothstep(threshold - softness, threshold + softness, distance);

    // Гашение цветной бахромы msdf на мелком кегле.
    float fringeSuppression = clamp((1.75 - pxRange) / 1.25, 0.0, 1.0);
    float cutoff = 0.10 * fringeSuppression;

    return clamp((alpha - cutoff) / max(1.0 - cutoff, 0.0001), 0.0, 1.0);
}

void main() {
    float distance = median(texture(Sampler0, TexCoord).rgb);
    float pxRange = max(screenPxRange(), 0.0001);
    float softness = max(EDGE_SOFTNESS_PX * max(Smoothness, 0.0001) / pxRange, 0.0001);
    float threshold = 0.5 - Thickness;

    float alpha = coverage(distance, threshold, pxRange, softness);
    vec4 color = vec4(FragColor.rgb, FragColor.a * alpha);

    if (Outline) {
        color = mix(OutlineColor, FragColor, alpha);
        color.a *= coverage(distance, threshold - OutlineThickness, pxRange, softness);
    }

    OutColor = color;
}
