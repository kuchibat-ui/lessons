package lesson11;

import lesson11.interfaces.Flyable;
import lesson11.interfaces.Huntable;
import lesson11.interfaces.Soundable;

import java.util.ArrayList;

public class Main {
    //Орел, Слон, Жираф, Тигр и Лебедь
    // еда, имя и возраст
    // Определим, кто ест? - все животные
    // Определим, кто охотится? - Орел и тигр
    // Определим, кто издает звуки? - Орел, Слон, Тигр и Лебедь
    // Определим, кто летает? - Орел и Лебедь
    // Определим, кто ходит ногами? - все животные

    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe("Мелмон", 15, "листья");
        Swan swan = new Swan("Наташа", 20, "рыба");
        Eagle eagle = new Eagle("Инокентий", 70, "падаль");
        Tiger tiger = new Tiger("Вася", 24, "мясо");
        Elephant elephant = new Elephant("Дормидонт", 13, "фрукты");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(giraffe);
        animals.add(swan);
        animals.add(eagle);
        animals.add(tiger);
        animals.add(elephant);

        for (Animal animal : animals) {
            animal.eat();
            animal.moveOnLegs();

            if (animal instanceof Flyable) {
                Flyable flyable = (Flyable) animal;
                flyable.fly();
            }

            if (animal instanceof Huntable) {
                Huntable huntable = (Huntable) animal;
                huntable.hunt();
            }

            if (animal instanceof Soundable) {
                Soundable soundable = (Soundable) animal;
                soundable.sound();
            }

            System.out.println();
        }
    }
}
