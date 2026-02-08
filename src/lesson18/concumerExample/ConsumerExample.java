package lesson18.concumerExample;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "", "Семечека");
        System.out.println("Выведем на консоль все не пустые слова");
        for (String word : words) {
            if (word != null && !word.isEmpty()) {
                System.out.println(word);
            }
        }

        System.out.println("\nВыведем на консоль все не пустые слова через Consumer");
        PrintConsumer printConsumer = new PrintConsumer();
        for (String word : words) {
            printConsumer.accept(word);
        }

        System.out.println("Выведем на консоль не пустые слова через анонимный класс Consumer");
        Consumer<String> printConsumer2 = word -> {
            if (word != null && !word.isEmpty()) {
                System.out.println(word);
            }
        };
        for (String word : words) {
            printConsumer2.accept(word);
        }
    }
}
