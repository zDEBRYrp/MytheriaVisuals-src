#version 150

in vec3 Position;

// Полноэкранный квад ровно на дальней плоскости (глубина 1.0): при depthFunc EQUAL
// он закрашивает только пиксели неба, где мир ничего не нарисовал.
void main() {
    gl_Position = vec4(Position.xy, 1.0, 1.0);
}
