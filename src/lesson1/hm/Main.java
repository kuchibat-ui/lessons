package lesson1.hm;

public class Main {
    public static void main(String[] args) {
        System.out.println("задача : расчет периметра для \n" +
                "1) квадрат со стороной 19 "
        );


        int a = 19; // сторона квадрата
        int square = a * 4;

        System.out.println(" 2) прямоугольник со длинной 10 и шириной 5");

        int b = 10;
        int c = 5;  //стороны прямоугольника
        int rectangle = 2 * (b + c);

        System.out.println(" 3) трапеции со сторонами 4, 7, 9, 1");
        int d = 4;
        int e = 7;
        int f = 9;
        int g = 1;  // стороны трапеции
        int trapezoid = d + e + f + g;


        System.out.println("периметр квадрата= " + square +
                ", периметр прямоугольника " + rectangle +
                ", периметр трапеции " + trapezoid);
    }
}