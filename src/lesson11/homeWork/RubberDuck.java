package lesson11.homeWork;



public class RubberDuck extends  Duck {

    public RubberDuck(String color, String name) {
        super("резиновая ",color, name);
    }

    @Override
     String swim() {
        String toSwim="плаваю по волнам";
        return toSwim;
    }
}
