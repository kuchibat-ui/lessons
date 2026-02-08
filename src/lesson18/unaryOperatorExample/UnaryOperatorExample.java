package lesson18.unaryOperatorExample;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        //Предположим, что у нас есть сайт, где при регистрации пользователя приветствуют по имени, которое он указал
        System.out.println("Введите ваше Имя");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        UnaryOperator<String> greetingOperator = name -> name + ", здравствуйте!";

        System.out.println(greetingOperator.apply(userName));
    }
}
