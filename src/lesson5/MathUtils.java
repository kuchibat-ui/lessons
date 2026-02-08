package lesson5;
public class MathUtils {

    /**
     * Метод расчета периметра треугольника (с возвратом значения - результата выполнения метода)
     *
     * @param a длина стороны а
     * @param b длина стороны b
     * @param c длина стороны с
     */
    public static int calculateTrianglePerimeterAndPrint(int a, int b, int c) {
        int perimeter = a + b + c;
        System.out.println("\nпериметр треугольника равен " + perimeter);
        return perimeter;
    }

    /**
     * метод расчета периметра квадрата
     *
     * @param a длина одной стороны
     * @return perimeter 4*a
     */
    public static int calculateSqaerePerimeterAndPrint(int a) {
        int perimeter = 4 * a;
        System.out.println("\nпериметр квадрата равен " + perimeter);
        return perimeter;
    }

    /**
     * метод расчета длины окружности
     *
     * @param radius радиус
     * @return 2*pi*r
     */
    public static double calculateCircleLengthAndPrint(double radius) {
        double length = 2 * 3.14 * radius;
        System.out.printf(" \nдлина окружности равна %.2f", length);
        return length;
    }

    /**
     * метод для расчета периметра трапеции
     *
     * @param a длина стороны трапеции
     * @param b длина стороны трапеции
     * @param c длина стороны трапеции
     * @param d длина стороны трапеции
     * @return сумму всех сторан трапеции
     */
    public static int calculateTrapezoidParameterAndPrint(int a, int b, int c, int d) {
        int perimeter = a + b + c + d;
        System.out.println(" \nпериметр трапеции равен " + perimeter);
        return perimeter;
    }

    /**
     * @param a длинная полуось эллипса
     * @param b короткая полуось эллипса
     * @return возврацает длину овала P = 2π(R² + r²)/2
     */
    public static double calculateOvalLengthAndPrint(double a, double b) {
        double length = 2 * 3.14 * (Math.pow(a, 2)) + Math.pow(b, 2) / 2;
        System.out.printf("\nдлина овала равна %.2f", length);
        return length;
    }
}
