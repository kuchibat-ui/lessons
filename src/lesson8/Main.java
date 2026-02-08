package lesson8;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 15, 10);
        cat.eat();
        cat.move();
        cat.lookAtOwnerWithContempt();
        System.out.println(cat  + "\n");

        Bird bird = new Bird("Наташа", 100, 50);
        bird.eat();
        bird.move();
        bird.fly();
        System.out.println(bird + "\n");

        Dog dog = new Dog("Шарик", 1, 2);
        dog.eat();
        dog.move();
        dog.runToBall();
        dog.toBeGoodBoy();
        System.out.println(dog + "\n");

        Animal bird2 = new Bird("Глаша", 20, 2);
        bird2.eat();
        bird2.move();
        System.out.println(bird + "\n");

        System.out.println("Работаем с животными пакетно");
        Animal[] animals = {cat, bird, dog, bird2};
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
            animal.move();
            System.out.println();

            if (animal instanceof Cat) {
                Cat catFromArray = (Cat) animal;
                catFromArray.lookAtOwnerWithContempt();
            }

            if (animal instanceof Dog) {
                Dog dogFromArray = (Dog) animal;
                dogFromArray.runToBall();
                dogFromArray.toBeGoodBoy();
            }

            if (animal instanceof Bird) {
                Bird birdFromArray = (Bird) animal;
                birdFromArray.fly();
            }
        }
    }
}
