#version 150

uniform sampler2D Sampler0;

uniform vec2  uResolution;
uniform float uFov;
uniform vec3  uCamRight;
uniform vec3  uCamUp;
uniform vec3  uFogColor;
uniform float uFogAmount;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    vec3 color = texture(Sampler0, texCoord).rgb;

    if (uFogAmount > 0.0) {
        // Направление взгляда в пикселе, чтобы туман густел к горизонту, как у ванильного неба.
        vec3 right = normalize(uCamRight);
        vec3 up = normalize(uCamUp);
        vec3 forward = -cross(right, up);

        float tanV = tan(radians(uFov) * 0.5);
        vec2 ndc = texCoord * 2.0 - 1.0;
        vec3 dir = normalize(forward + right * ndc.x * tanV * uResolution.x / uResolution.y + up * ndc.y * tanV);

        float fog = uFogAmount * mix(1.0, 0.35, smoothstep(0.0, 0.6, dir.y));
        color = mix(color, uFogColor, clamp(fog, 0.0, 1.0));
    }

    fragColor = vec4(color, 1.0);
}
