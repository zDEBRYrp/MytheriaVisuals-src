// Математика форм перенесена из Aero: угол - суперэллипс (iOS-подобный squircle),
// а край сглаживается по производной экранного пространства, то есть ровно на один
// физический пиксель при любом guiScale. Функции используют fwidth и поэтому
// подключаются только во фрагментных шейдерах.
const float SQUIRCLE_EXPONENT = 4.0;
const float CIRCLE_EXPONENT = 2.0;

/**
 * Показатель суперэллипса. Для обычных карточек это iOS-угол, но у пилюль и кружков,
 * где радиус равен половине меньшей стороны, суперэллипс распрямляет торцы в почти
 * прямые - там плавно возвращаемся к настоящей дуге окружности.
 */
float rexponent(vec2 sizePx, float radius) {
    float fill = radius / max(min(sizePx.x, sizePx.y) * 0.5, 0.0001);
    return mix(SQUIRCLE_EXPONENT, CIRCLE_EXPONENT, smoothstep(0.75, 1.0, fill));
}

float rcorner(vec2 p, vec2 sizePx, vec4 radiiPx) {
    bool left = p.x <= sizePx.x * 0.5;
    bool top = p.y <= sizePx.y * 0.5;

    if (left && top) {
        return radiiPx.x;
    }

    if (!left && top) {
        return radiiPx.y;
    }

    if (!left && !top) {
        return radiiPx.z;
    }

    return radiiPx.w;
}

float rdist(vec2 p, vec2 sizePx, vec4 radiiPx) {
    // Радиус больше половины стороны геометрически невозможен: без ограничения
    // форма выворачивается наизнанку.
    float radius = min(rcorner(p, sizePx, radiiPx), min(sizePx.x, sizePx.y) * 0.5);
    vec2 halfSize = sizePx * 0.5;
    vec2 centered = p - halfSize;
    vec2 q = abs(centered) - (halfSize - vec2(radius));

    vec2 corner = max(q, vec2(0.0));

    // Суперэллипс нужен только там, где обе компоненты положительны, то есть внутри
    // квадратика radius x radius в самом углу. На всей остальной площади хотя бы одна
    // компонента обнулена, pow(0, e) = 0 и корень степени e возвращает вторую компоненту
    // как есть - результат тот же, что у max(). Безусловные три pow на фрагмент стоили
    // дороже всего остального шейдера вместе взятого и платились за каждый пиксель заливки.
    float cornerDistance;

    if (radius > 0.0 && corner.x > 0.0 && corner.y > 0.0) {
        float exponent = rexponent(sizePx, radius);
        cornerDistance = pow(pow(corner.x, exponent) + pow(corner.y, exponent), 1.0 / exponent);
    } else {
        cornerDistance = max(corner.x, corner.y);
    }

    return min(max(q.x, q.y), 0.0) + cornerDistance - radius;
}

/** Мягкость края в один физический пиксель; smoothness <= 0 - жёсткий край. */
float rsoftness(float dist, float smoothness) {
    return smoothness <= 0.0 ? 0.0001 : max(fwidth(dist) * 0.5, 0.0001);
}

float ralpha(vec2 sizePx, vec2 coord, vec4 radiiPx, float smoothness) {
    float dist = rdist(coord * sizePx, sizePx, radiiPx);
    float softness = rsoftness(dist, smoothness);

    return 1.0 - smoothstep(-softness, softness, dist);
}

/**
 * Тот же силуэт, но с одним радиусом на все углы - именно так интерфейс и рисуется.
 * Без выбора угла по положению фрагмента отпадают четыре сравнения rcorner на пиксель.
 */
float rdist1(vec2 p, vec2 sizePx, float radiusPx) {
    float radius = min(radiusPx, min(sizePx.x, sizePx.y) * 0.5);
    vec2 halfSize = sizePx * 0.5;
    vec2 q = abs(p - halfSize) - (halfSize - vec2(radius));

    vec2 corner = max(q, vec2(0.0));
    float cornerDistance;

    if (radius > 0.0 && corner.x > 0.0 && corner.y > 0.0) {
        float exponent = rexponent(sizePx, radius);
        cornerDistance = pow(pow(corner.x, exponent) + pow(corner.y, exponent), 1.0 / exponent);
    } else {
        cornerDistance = max(corner.x, corner.y);
    }

    return min(max(q.x, q.y), 0.0) + cornerDistance - radius;
}

float ralpha1(vec2 sizePx, vec2 localPx, float radiusPx, float smoothness) {
    float dist = rdist1(localPx, sizePx, radiusPx);
    float softness = rsoftness(dist, smoothness);

    return 1.0 - smoothstep(-softness, softness, dist);
}
