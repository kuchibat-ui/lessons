package lesson11.homeWork;

import lesson11.homeWork.interfacesHw.Birthable;
import lesson11.homeWork.interfacesHw.Flyable;
import lesson11.homeWork.interfacesHw.Quackable;

public class LiveDuck extends Duck implements Birthable, Flyable, Quackable {

    public LiveDuck(String color, String name) {
        super("живая ", color, name);
    }

    @Override
    public void birth() {
        System.out.println("у меня есть утята");
    }

    @Override
    public void fly() {
        System.out.println(" умею высоко летать");
    }

    @Override
    public void quack() {
        System.out.println(" громко крякаю высоко в небе");

    }

    @Override
    String swim() {
        String toSwim = "могу плавать и нырять";
        return toSwim;
    }
}
