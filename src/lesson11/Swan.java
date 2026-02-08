package lesson11;

import lesson11.interfaces.Flyable;
import lesson11.interfaces.Soundable;

public class Swan extends Animal implements Flyable, Soundable {

    public Swan(String name, int age, String food) {
        super("Лебедь", name, age, food);
    }

    @Override
    public void eat() {
        System.out.println("Ем хлебные крошки");
    }

    @Override
    public void moveOnLegs() {
        System.out.println("Хожу переваливаясь с бока на бок, лучше бы полетел");
    }

    @Override
    public void fly() {
        System.out.println("Летаю от озера к озеру");
    }

    @Override
    public void sound() {
        System.out.println("Издаю крякающие звуки");
    }
}
