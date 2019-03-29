package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon, Shape, Point{
   float a;
   float b;
  //float p= a+b;



    float pointA [] = {1,4};
    float pointB [] = {1,4};
    float pointC [] = {1,4};
    float pointD [] = {1,4};


    float aX= Point.getX(pointA);
    float aY= Point.getY(pointA);
    float bX= Point.getX(pointB);
    float bY= Point.getY(pointB);
    float cX= Point.getX(pointC);
    float cY= Point.getY(pointC);
    float dX= Point.getX(pointD);
    float dY= Point.getY(pointD);

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public Rectangle(float[] pointA, float[] pointB, float[] pointC, float[] pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
    }

    public float[] getPointA() {
        return pointA;
    }

    public float[] getPointB() {
        return pointB;
    }

    public float[] getPointC() {
        return pointC;
    }

    public float[] getPointD() {
        return pointD;
    }

    public void setPointA(float[] pointA) {
        this.pointA = pointA;
    }

    public void setPointB(float[] pointB) {
        this.pointB = pointB;
    }

    public void setPointC(float[] pointC) {
        this.pointC = pointC;
    }

    public void setPointD(float[] pointD) {
        this.pointD = pointD;
    }
    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public float getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public float getArea() {
        return a*b;
    }


    public Rectangle setRotation(Rectangle rectangleOriginal, int f) {
        float [] a = rectangleOriginal.getPointA(); // получаем точки с координатами высот квадрата
        float [] b = rectangleOriginal.getPointB();
        float [] c = rectangleOriginal.getPointC();
        float [] d = rectangleOriginal.getPointD();

        float aX= Point.getX(a); //получаем отдельно координаты Х и У каждой точки
        float aY= Point.getY(a);
        float bX= Point.getX(b);
        float bY= Point.getY(b);
        float cX= Point.getX(c);
        float cY= Point.getY(c);
        float dX= Point.getX(d);
        float dY= Point.getY(d);

        f =15;//задаем угол поворота фигуры

        float aX1 = aX * (float) Math.cos(Math.toRadians(f)) - aY * (float)Math.sin(Math.toRadians(f));  // получаем координаты каждой вершины повернутого прямоугольника относительно точки с координатами [0,0]
        float aY1 = aX * (float) Math.cos(Math.toRadians(f)) - aY * (float)Math.sin(Math.toRadians(f));
        float bX1 = bX * (float) Math.cos(Math.toRadians(f)) - bY * (float)Math.sin(Math.toRadians(f));
        float bY1 = bX * (float) Math.cos(Math.toRadians(f)) - bY * (float)Math.sin(Math.toRadians(f));
        float cX1 = cX * (float) Math.cos(Math.toRadians(f)) - cY * (float)Math.sin(Math.toRadians(f));
        float cY1 = cX * (float) Math.cos(Math.toRadians(f)) - cY * (float)Math.sin(Math.toRadians(f));
        float dX1 = dX * (float) Math.cos(Math.toRadians(f)) - dY * (float)Math.sin(Math.toRadians(f));
        float dY1 = dX * (float) Math.cos(Math.toRadians(f)) - dY * (float)Math.sin(Math.toRadians(f));

        float [] a1 = {aX1,aY1}; // присваиваем вершинам повернутого квадрата новые координаты
        float [] b1 = {bX1,bY1};
        float [] c1 = {cX1,cY1};
        float [] d1 = {dX1,dY1};


        Rectangle rectangleTurned = new Rectangle (a1,b1,c1,d1); //создаем повернутый прямоугольник
        return rectangleTurned;
    }


    @Override
    public int getRotation(Rectangle rectangleTurned, Rectangle rectangleOriginal) {
        float [] aTurn = rectangleTurned.getPointA(); // получаем точки с координатами высот повернутого квадрата
        float [] bTurn = rectangleTurned.getPointB();
        float [] cTurn = rectangleTurned.getPointC();
        float [] dTurn = rectangleTurned.getPointD();

        float [] aOrig = rectangleOriginal.getPointA(); // получаем точки с координатами высот исходного квадрата
        float [] bOrig = rectangleOriginal.getPointB();
        float [] cOrig = rectangleOriginal.getPointC();
        float [] dOrig = rectangleOriginal.getPointD();


        float aTurnX= Point.getX(aTurn); //получаем отдельно координаты Х и У каждой точки
        float aTurnY= Point.getY(aTurn);


        float aOrigX= Point.getX(aOrig); //получаем отдельно координаты Х и У каждой точки
        float aOrigY= Point.getY(aOrig);


        int cosF= (int)((aTurnX*aOrigX + aTurnY*aOrigY)/(((float) Math.sqrt((float)Math.pow((aTurnX),2)+(float)Math.pow((aTurnY),2))) *((float) Math.sqrt((float)Math.pow((aOrigX),2)+(float)Math.pow((aOrigY),2))))); // получаем косинус угла между векторами от начала координат и вершиной смещенного и заданного прямоугольника

        int F = (int) Math.acos(Math.toRadians(cosF)); // получаем угол

        return F;
    }

    public String toString (){
        return " у квадрата ";
    }


}
