package lesson11;

import java.util.Objects;

public abstract class Animal {
    private final String type;
    private String name;
    private int age;
    private String food;

    public Animal(String type, String name, int age, String food) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public abstract void eat();

    public abstract void moveOnLegs();

    public String getType() {
        return type;
    }

    public String getFood() {
        return food;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(type, animal.type) && Objects.equals(name, animal.name) && Objects.equals(food, animal.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, age, food);
    }

    @Override
    public String toString() {
        return String.format("Животное - %s, имя - %s, возраст - %s, ест - %s", type, name, age, food);
    }
}
