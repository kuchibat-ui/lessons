package lesson9.homeWork9_1;

import java.util.Objects;

public abstract class Shape {
    private  final String type;
    private double length;

    public Shape(String type, double length) {
        this.type = type;
        this.length = length;
    }
    abstract double calculateArea();

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("площадь  %sа, с такими данными равна %s", type, calculateArea());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Double.compare(length, shape.length) == 0 && Objects.equals(type, shape.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, length);
    }
}
