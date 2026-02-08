package lesson11;

import lesson11.interfaces.Flyable;
import lesson11.interfaces.Huntable;

public class Eagle extends Animal implements Flyable, Huntable {

    public Eagle(String name, int age, String food) {
        super("Ястреб", name, age, food);
    }

    @Override
    public void eat() {
        System.out.println("Ем всякую падаль");
    }

    @Override
    public void moveOnLegs() {
        System.out.println("Двигаюсь ногами плохо");
    }

    @Override
    public void fly() {
        System.out.println("Парю в небе в поисках добычи");
    }

    @Override
    public void hunt() {
        System.out.println("Падаю камнем вниз на добычу");
    }
}
