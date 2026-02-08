package lesson8;

public class Cat extends Animal {

    public Cat(String name, int age, double weight) {
        super("Кот/Кошка", name, age, weight);
    }

    public void lookAtOwnerWithContempt() {
        System.out.println("Смотрю на хозяина как на своего раба.");
    }

    @Override
    public void move() {
        System.out.println("Бегаю тихо как ниндзя");
    }

    @Override
    public void eat() {
        System.out.println("Ем только дорогой специальный корм");
    }
}
