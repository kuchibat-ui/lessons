package lesson9.homeWork9_1;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super("круг", radius);
        this.radius = radius;
        System.out.println("создан круг с радиусом: " + radius);
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
