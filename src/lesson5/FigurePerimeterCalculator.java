package lesson5;

import java.util.Scanner;

public class FigurePerimeterCalculator {
    public static void main(String[] args) {
        System.out.println("Добрый день! Я калькулятор периметров.");
        boolean isAllive = true;
        while (isAllive) {
            System.out.println("\nВыберите фигуру, по которой вы хотите посчитать периметр: ");
            System.out.println("1 - треугольник");
            System.out.println("2 - квадрат");
            System.out.println("3 - круг");
            System.out.println("4 - трапеция");
            System.out.println("5 - овал");
            System.out.println("0- выход\n");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();

            //получение данных от пользователя для сторон треугольника и вызов метода
            if (userChoice == 1) {
                System.out.println("Введите сторону а");
                int a = scanner.nextInt();
                System.out.println("Введите сторону b");
                int b = scanner.nextInt();
                System.out.println("Введите сторону c");
                int c = scanner.nextInt();
                int perimeter = MathUtils.calculateTrianglePerimeterAndPrint(a, b, c);
                System.out.println(perimeter);

                //получение данных от пользователя для сторон квадрата и вызов метода
            } else if (userChoice == 2) {
                System.out.println("Введите сторону квадрато");
                int d = scanner.nextInt();
                int perimeter = MathUtils.calculateSqaerePerimeterAndPrint(d);

                //получение от пользователя радиуса круга и вызов метода
            } else if (userChoice == 3) {
                System.out.println("Введите радиус круга");
                double lengthCircle = scanner.nextDouble();
                double perimeter = MathUtils.calculateCircleLengthAndPrint(lengthCircle);

                // получение данных от пользователя для сторон трапеции и вызов метода
            } else if (userChoice == 4) {
                System.out.println("Введите длину сторону трапеции a");
                int a = scanner.nextInt();
                System.out.println("Введите длину сторону трапеции b");
                int b = scanner.nextInt();
                System.out.println("Введите длину сторону трапеции c");
                int c = scanner.nextInt();
                System.out.println("Введите длину сторону трапеции d");
                int d = scanner.nextInt();
                int perimeter = MathUtils.calculateTrapezoidParameterAndPrint(a, b, c, d);

                // получение данных от пользователя для создания эллипса и вызов метода
            } else if (userChoice == 5) {
                System.out.println("Введите длинную полуось эллипса");
                double a = scanner.nextDouble();
                System.out.println("Введите короткую полуось эллипса");
                double b = scanner.nextDouble();
                double perimeter = MathUtils.calculateOvalLengthAndPrint(a, b);
            } else if (userChoice == 0) {
                isAllive = false;
            }
        }
        System.out.println("спасибо, что воспользовались нашим приложением");
    }
}
