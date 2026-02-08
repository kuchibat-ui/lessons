package lesson8;

public class Dog extends Animal {

    public Dog(String name, int age, double weight) {
        super("Собака", name, age, weight);
    }

    public void runToBall() {
        System.out.println("Шустро бегаю за мячом.");
    }

    public void toBeGoodBoy() {
        System.out.println("Я хороший пацан.");
    }

    @Override
    public void move() {
        System.out.println("Лениво хожу");
    }

    @Override
    public void eat() {
        System.out.println("Ем все подряд");
    }
}

