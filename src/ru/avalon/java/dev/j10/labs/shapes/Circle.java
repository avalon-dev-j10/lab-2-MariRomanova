package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Shape,Ellipse{
   // float centr [] =  {7,28}; //координата центра окружности
   // float ocr [] = new float [2]; //координата точки на окружности
    float r;

    public Circle(float r) {
        this.r = r;
    }

//    public Circle(float[] centr, float [] ocr) {
//        this.centr = centr;
//        this.ocr = ocr;
//    }

//    public float[] getCentr() {
//        return centr;
//    }
//
//    public float[] getOcr() {
//        return ocr;
//    }

    public float getArea() {
        float area= 2*(float)Math.PI*(float)Math.pow(r,2);
        return area;
    }



//    @Override
//    public float getArea(float r) {
//       float area= 2*(float)Math.PI*(float)Math.pow(r,2);
//       return area;
//    }

    @Override
    public float getLength() {
        return 2*(float)Math.PI*r;
    }
    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    public String toString (){
        return "у круга";
    }
}
