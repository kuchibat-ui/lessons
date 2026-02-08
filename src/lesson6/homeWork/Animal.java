package lesson6.homeWork;

import java.util.Objects;

public class Animal {
    double height;
    double weight;
    String favoriteFood;
    final String name;
    final String color;
    final int quantityPaws;


    public Animal(String color, String favoriteFood, double height, String name, int quantityPaws, double weight) {
        this.color = color;
        this.favoriteFood = favoriteFood;
        this.height = height;
        this.name = name;
        this.quantityPaws = quantityPaws;
        this.weight = weight;
    }

    /**
     * метод который выводит в консоль имя
     */
    public void toSpeak() {
        System.out.println("привет меня зовут " + name );
    }

    /**
     * выводит в консоль любимую еду
     */
    public void toEat() {
        System.out.println("моя любимая еда: " + favoriteFood);
    }

    /**
     * выводит в консоль вес
     */
    public void toTellWeight() {
        System.out.println("мой вес: " + weight + " кг");
    }

    /**
     * выводит в консоль рост
     */
    public void toTellHeight() {
        System.out.println("мой рост: " + height + " метра");
    }

    /**
     * выводит в консоль окрас
     */
    public void toTellColor() {
        System.out.println("я " + color + " цвета");
    }

    /**
     * выводит в консоль количество ног
     */
    public void toTellPaws() {
        System.out.println("у меня " + quantityPaws + " лапы");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(height, animal.height) == 0 && Double.compare(weight, animal.weight) == 0 &&
                quantityPaws == animal.quantityPaws && Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color) && Objects.equals(favoriteFood, animal.favoriteFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, weight, name, color, quantityPaws, favoriteFood);
    }

    @Override
    public String toString() {
        return name;
    }
}
