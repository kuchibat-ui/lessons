package lesson18.unaryOperatorExample;

import java.util.function.UnaryOperator;

public class HelloOperator implements UnaryOperator<String> {
    @Override
    public String apply(String name) {
        return name.toUpperCase() + ", здравствуйте!";
    }
}
