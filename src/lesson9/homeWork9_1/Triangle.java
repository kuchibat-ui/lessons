package lesson9.homeWork9_1;

public class Triangle extends Shape {

    double height;

    public Triangle(double length, double height) {
        super("треугольник", length);
        this.height = height;
        System.out.println("создан треугольник со сторонами: " + length + " и " + height);
    }

    @Override
    public double calculateArea() {
        double area = (getLength() * height) / 2;
        return area;
    }
}
