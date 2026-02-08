package lesson11;

import lesson11.interfaces.Huntable;
import lesson11.interfaces.Soundable;

public class Tiger extends Animal implements Huntable, Soundable {

    public Tiger(String name, int age, String food) {
        super("Тигр", name, age, food);
    }

    @Override
    public void eat() {
        System.out.println("Мясо");
    }

    @Override
    public void moveOnLegs() {
        System.out.println("Стелс на лапках");
    }

    @Override
    public void hunt() {
        System.out.println("Охочусь из кустов на антилоп");
    }

    @Override
    public void sound() {
        System.out.println("Громогласный рык");
    }
}
