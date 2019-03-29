package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Абстрактное представление о точке.
 * <p>
 * То́чка — абстрактный объект в пространстве, не имеющий
 * никаких измеримых характеристик (нульмерный объект).
 * Точка является одним из фундаментальных понятий в
 * математике.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D0%BE%D1%87%D0%BA%D0%B0_(%D0%B3%D0%B5%D0%BE%D0%BC%D0%B5%D1%82%D1%80%D0%B8%D1%8F)">Точка</a>
 */
public interface Point {

    /*
     * TODO: Закончить определение интерфейса 'Point'
     *
     * 1. Включите интерфейс в общую систему типов.
     *
     * 2. При необходимости, дополните структуру интерфеса.
     */
    float point [] = new float [2];

    /**
     * Возвращает абсциссу точки.
     * <p>
     * Абсциссой точки A называется координата этой точки на
     * оси X в прямоугольной системе координат.
     *
     * @return x-координату точки
     *
     * @see <a href="https://ru.wikipedia.org/wiki/%D0%90%D0%B1%D1%81%D1%86%D0%B8%D1%81%D1%81%D0%B0">Абсцисса</a>
     */

    static float getX(float point[]){
        return point[0];
    };

    /**
     * Возвращает ординату точки.
     * <p>
     * Ординатой точки A называется координата этой точки на
     * оси Y в прямоугольной системе координат.
     *
     * @return н-координату точки
     *
     * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D1%80%D0%B4%D0%B8%D0%BD%D0%B0%D1%82%D0%B0">Ордината</a>
     */
    static float getY(float point []) {
        return point[1];
    }

    static float getLength(float X1, float Y1, float X2, float Y2) {

        float length = (float) Math.sqrt((float)Math.pow((X2-X1),2) + (float)Math.pow((Y2-Y1),2));
        return length;

    }

}
