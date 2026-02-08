package lesson8;

public class Bird extends Animal {

    public Bird(String name, int age, double weight) {
        super("Птица", name, age, weight);
    }

    public void fly() {
        System.out.println("Летаю высоко в небе.");
    }

    @Override
    public void move() {
        System.out.println("Медленно хожу на двух лапках, лучше бы полетела");
    }

    @Override
    public void eat() {
        System.out.println("Ем то попадет в клюв.");
    }


    }

