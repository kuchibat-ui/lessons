package lesson9.homeWork9_1;

public class Rectangle extends Shape {

    double width;

    public Rectangle(double length, double width) {
        super("прямоугольник", length);
        this.width = width;
        System.out.println("создан прямоугольник со сторонами: " + length + " и " + width);
    }

    @Override
    public double calculateArea() {
        double area = getLength() * width;
        return area;
    }
}
