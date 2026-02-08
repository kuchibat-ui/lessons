package lesson18.supplierExample;

import java.util.Random;
import java.util.function.Supplier;

public class RandomEvenNumbersGenerator implements Supplier<Integer> {

    @Override
    public Integer get() {
            int number = new Random().nextInt(999);
            while (number % 2 != 0) {
               number = new Random().nextInt(999);
            }

            return number;
    }
}
