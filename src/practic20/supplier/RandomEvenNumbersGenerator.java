package practic20.supplier;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;


// функциональный интерфейс который на вход ничего не принимает , но выдает на выход объект
// продавец , только выдает
// генерация нового объекта без входных данных
public class RandomEvenNumbersGenerator implements Supplier<Integer> {

    @Override
    public Integer get() {
        int number = 1;       // это просто для запуска цикла while
        while (number % 2  != 0) {
            number = ThreadLocalRandom.current().nextInt(1, 999);
        }
        return number;        // возвращаем четное число
    }
}
