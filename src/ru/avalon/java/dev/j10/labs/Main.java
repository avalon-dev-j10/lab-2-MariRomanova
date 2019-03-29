package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main implements Point {

    public static void main(String[] args) {
            /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */

        Shape[] shapes = new Shape [10];
        for(int i = 0; i < 10; i++){
            int rnd = 1 + (int)(Math.random() * ((3 - 1) + 1)); // задаем пременную для определения какой тип фигуры будет создан
            switch (rnd){
                case 1: shapes[i] = new Circle((float) (Math.random() * ((50 - 1) + 1)));
                        break;
                case 2: shapes[i] = new Triangle((float)(Math.random() * ((100 - 1) + 1)),(float)(Math.random() * ((100 - 1) + 1)),(float)(Math.random() * ((100 - 1) + 1)) );
                        break;
                case 3: shapes[i] = new Rectangle((float)(Math.random() * ((100 - 1) + 1)),(float)(Math.random() * ((100 - 1) + 1)));

            }
        };
        getMaxArea(shapes);


// часть с расчетом угла поворота фигуры

        float pointA [] = {1,4};
        float pointB [] = {2,4};
        float pointC [] = {2,3};
        float pointD [] = {1,3};

        Rectangle rotateRect = new Rectangle(pointA,pointB,pointC,pointD);

        Rectangle rotateRect1 = rotateRect.setRotation(rotateRect, 30);

        int f = rotateRect1.getRotation(rotateRect1, rotateRect);

        System.out.println ("rezalt sci" + f); // фокус не удался



    };

    public static void getMaxArea(Shape[] shapes){
        float max = shapes[0].getArea();
        int j = 0;
        for (int i = 0; i < shapes.length; i++){
            if (max < shapes[i].getArea()){
                max = shapes[i].getArea();
                j=i;
            }
        }
        System.out.println ("Самая большая площадь" + shapes[j] + "равная " + max);

    }
}
