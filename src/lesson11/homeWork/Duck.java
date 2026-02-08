package lesson11.homeWork;

import java.util.Objects;

public abstract class Duck {
    private final String type;
    private String name;
    private String color;

    public Duck(String type, String color, String name) {
        this.type = type;
        this.color = color;
        this.name = name;
    }
    abstract String swim();

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return Objects.equals(type, duck.type) && Objects.equals(name, duck.name) && Objects.equals(color, duck.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, color);
    }

    @Override
    public String toString() {
        return String.format("Я утка -%s, меня зовут- %s, цвет- %s, %s",type,name,color,swim());
    }
}
