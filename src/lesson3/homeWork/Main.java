package lesson3.homeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1. Есть массив чисел от 1 до 30. Выводить в консоль все четные числа, " +
                "кроме 6, 10, 14. Как только цикл дойдет до 23,\n остановить вывод и написать в консоль" +
                " “достигнуто целевое число!”.\n");

        int limit=23;

        for (int number = 1; number <= 30; number++) {
            if (number==6 || number==10 || number==14){
                continue;
            }
            if (number==limit){
                System.out.println("\nдостигнуто целевое число!");
                return;   // как вариант использовать оператор 'break' результат такой же
            }
            if (number % 2 == 0) {

                System.out.print(number + " ");
            }
        }
    }
}