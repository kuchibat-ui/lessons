package lesson11;

public class Giraffe extends Animal {

    public Giraffe(String name, int age, String food) {
        super("Жираф", name, age, food);
    }

    @Override
    public void eat() {
        System.out.println("Ем верхние листья с деревьев");
    }

    @Override
    public void moveOnLegs() {
        System.out.println("Передвигаюсь на длинных ногах");
    }
}
