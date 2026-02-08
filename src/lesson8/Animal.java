package lesson8;

import java.util.Objects;

public class Animal {
    private final String type;
    private String name;
    private int age;
    private double weight;

    public Animal(String type, String name, int age, double weight) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void move() {

    }

    public void eat() {

    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && Objects.equals(type, animal.type) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, age, weight);
    }

    @Override
    public String toString() {
        return String.format("Это %s, его зовут %s, его возраст %d, его вес %s", type, name, age, weight);
    }
}
