package lesson18.predicateExample;

import java.util.function.Predicate;

public class WordValidationPredicate implements Predicate<String> {
    @Override
    public boolean test(String word) {
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
    }
}
