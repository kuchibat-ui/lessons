package practic20.supplier;

import java.util.concurrent.ThreadLocalRandom;

public class SupplyExample {
    public static void main(String[] args) {
        System.out.println(" Сгенерируем 10 случайных чисел, от 1 до 999, только четные");
        RandomEvenNumbersGenerator generator = new RandomEvenNumbersGenerator();
        for (int index = 0; index < 10; index++) {
            System.out.println(generator.get());
        }

    }
}
