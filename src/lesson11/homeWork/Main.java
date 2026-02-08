package lesson11.homeWork;

import lesson11.homeWork.interfacesHw.Birthable;
import lesson11.homeWork.interfacesHw.Flyable;
import lesson11.homeWork.interfacesHw.Quackable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LiveDuck macDuck = new LiveDuck("белый", "МакДак");
        RubberDuck babyDuck = new RubberDuck("желтый", "Утенок малыш");
        PlushDuck softDuck = new PlushDuck("зеленый", "пушистик");

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(macDuck);
        ducks.add(babyDuck);
        ducks.add(softDuck);

        for (Duck duck : ducks) {
            System.out.println(duck);

            if (duck instanceof Birthable) {
                Birthable birthable = (Birthable) duck;
                birthable.birth();
            }
            if (duck instanceof Flyable) {
                Flyable flyable = (Flyable) duck;
                flyable.fly();
            }
            if (duck instanceof Quackable) {
                Quackable quackable = (Quackable) duck;
                quackable.quack();
            }
            System.out.println("---------------");
        }
    }
}
