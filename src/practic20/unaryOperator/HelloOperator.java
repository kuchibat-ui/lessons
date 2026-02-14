package practic20.unaryOperator;

import java.util.function.UnaryOperator;

// функциональный интерфейс который принимает на вход объект и возвращает объект измененным

public class HelloOperator implements UnaryOperator<String> {
    @Override
    public String apply(String name) {
        return "добро пожаловать "+ name;
    }
}
