package lesson11;

import lesson11.interfaces.Soundable;

public class Elephant extends Animal implements Soundable {

    public Elephant(String name, int age, String food) {
        super("Слон", name, age, food);
    }

    @Override
    public void eat() {
        System.out.println("Ем длинным хоботом до чего дотянусь");
    }

    @Override
    public void moveOnLegs() {
        System.out.println("Хожу и давлю все под ногами");
    }

    @Override
    public void sound() {
        System.out.println("Издаю звуки хоботом, похожие трубу");
    }
}
