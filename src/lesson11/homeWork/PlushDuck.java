package lesson11.homeWork;

import lesson11.homeWork.interfacesHw.Quackable;


public class PlushDuck extends Duck implements  Quackable {

    public PlushDuck(String color, String name) {
        super("Плюшевая ",color, name);
    }

    @Override
    public void quack() {
        System.out.println("могу громко крякнуть, если на меня наступят");
    }

    @Override
    String swim() {
        String toSwim="плыву туда куда подует ветер";
        return toSwim;
    }
}
