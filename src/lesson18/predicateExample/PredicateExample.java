package lesson18.predicateExample;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> words = List.of("Дом", "Город", "Пирамида", "Треугольник", "Тетрадь", "Танк", "Семечка");

        System.out.println("\nНайдем все слова с буквой Т большой или маленькой, с буквой е большой или маленькой " +
                "и без буквы к большой или маленькой обычным способом");
        for (String word : words) {
            if ((word.contains("т") || word.contains("Т")) && (word.contains("е") || word.contains("Е"))
                    && (!word.contains("к") && !word.contains("К"))) {
                System.out.println(word);
            }
        }

        System.out.println("Определим то же самое с помощью предиката");
        WordValidationPredicate predicate = new WordValidationPredicate();
        for (String word : words) {
            if (predicate.test(word)) {
                System.out.println(word);
            }
        }

        System.out.println("Реализуем то же самое с помощью лямбы");
        Predicate<String> predicate2 = word -> {
            //Проверим, что слово не пустое(если пустое, вернуть false)
            if (word == null || word.isEmpty()) {
                return false;
            }

            String upperCaseWord = word.toUpperCase();

            if (!upperCaseWord.contains("Т")) {
                return false;
            }

            if (!upperCaseWord.contains("Е")) {
                return false;
            }

            if (upperCaseWord.contains("К")) {
                return false;
            }

            return true;
        };

        for (String word : words) {
            if (predicate2.test(word)) {
                System.out.println(word);
            }
        }

        System.out.println("А теперь напечатаем в консоль все слова с буквой Т или т");
        Predicate<String> predicate3 = word -> word.contains("Т") || word.contains("т");
        for (String word : words) {
            if (predicate3.test(word)) {
                System.out.println(word);
            }
        }
    }
}
