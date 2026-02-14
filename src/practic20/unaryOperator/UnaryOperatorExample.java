package practic20.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        //у нас есть сайт где при регистрации пользователя приветствует по имени которое он указал мы реализуем программу
       //  на этапе на котором данные от пользователя уже получены
        String name = "Сергей";
        System.out.println("добро пожаловать "+ name);


        // тоже самое но с использованием UnaryOperator
        HelloOperator helloOperator = new HelloOperator();
        System.out.println(helloOperator.apply(name));


        // через лямбду
        UnaryOperator<String> hello = (text) -> "Welcome "+ text+"!";
        System.out.println(hello.apply(name));
    }
}
