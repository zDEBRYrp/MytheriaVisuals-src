// Распаковка вершинных атрибутов фигуры: обратная сторона ShapeFormat в Java.
// Имя параметра намеренно не "packed" — это зарезервированное слово GLSL.
const float SHAPE_SIZE_SCALE = 4.0;
const float SHAPE_RADIUS_SCALE = 8.0;
const float SHAPE_THICKNESS_SCALE = 16.0;

vec2 sunpacksize(ivec2 raw) {
    return vec2(raw) / SHAPE_SIZE_SCALE;
}

float sunpackthickness(int raw) {
    return float(raw) / SHAPE_THICKNESS_SCALE;
}

/** Знак упакованного радиуса несёт флаг сглаживания края. */
float sunpackradius(int raw) {
    return float(raw >= 0 ? raw : -raw - 1) / SHAPE_RADIUS_SCALE;
}

float sunpacksmoothness(int raw) {
    return raw >= 0 ? 1.0 : 0.0;
}
