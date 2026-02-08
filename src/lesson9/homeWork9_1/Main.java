package lesson9.homeWork9_1;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(43.89, 65.57);
        Rectangle rectangle = new Rectangle(55.3, 21.6);
        Circle circle = new Circle( 87.3);

        Shape[] shapes = {triangle, rectangle, circle};
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
