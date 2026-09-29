#version 150

// Полноэкранный проход без матриц: вершины квада уже в 0..1
in vec3 Position;
in vec4 Color;

out vec2 TexCoord;
out vec4 FragColor;

void main() {
    gl_Position = vec4(Position.xy * 2.0 - 1.0, 0.0, 1.0);

    TexCoord = Position.xy;
    FragColor = Color;
}
