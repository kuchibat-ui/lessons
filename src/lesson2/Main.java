package lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Задача 1. есть ширина и длина стола, ширина и длина комнаты. Вычислить сколько столов " +
                "влезет в комнату");
        double widthOfTable = 234.56;
        double lenghtOfTable = 555.77;
        double widthOfRoom = 2556.58;
        double lenghtOfRoom = 6664.67;

        double areaOfTable = widthOfTable * lenghtOfTable;
        double areaOfRoom = widthOfRoom * lenghtOfRoom;

        int quantityOfTable = (int) (areaOfRoom / areaOfTable);
        System.out.println(" в комнату влезет " + quantityOfTable + " столов");


        System.out.println("\nЗадача 2. Есть три стороны треугольника. вывести в консоль какой это треугольник" +
                " равносторонний, равнобедренный или разносторонний");

        int a = 5;
        int b = 7;
        int c = 7;

        if (a == b && b == c && c == a) {
            System.out.println(" треугольник равносторонний");
        } else if (a == b || a == c || b == c) {
            System.out.println(" треугольник равнобедренный");
        } else {
            System.out.println(" треугольник разносторонний");
        }

        System.out.println("\n Задача 3. Вывести на консоль 10 раз фразу \"Привет мир\"");

        for (int index = 0; index < 10; index++) {
            System.out.println("привет мир");
        }

        System.out.println("\nЗадача 4. вывести на консоль все четные числа от 30 до 50");

        for (int index = 30; index <=50 ; index=index+2) {
            System.out.println(index);
        }

        System.out.println("\nдругое решение");
        for (int index = 30; index <=50 ; index++) {
            if (index%2==0){
                System.out.println(index);
            }
        }

        System.out.println("Задача 5. есть 10 млн, есть 15 дней, сумма увеличивается на 13% каждый день. " +
                "вывести на консоль сумму");

        double cash=10_000_000;
        int percentPerDay=13;

        for (int day = 1; day <=15 ; day++) {
            cash=cash+cash*percentPerDay/100;
            System.out.printf("\nпромежуточная сумма: %.2f ",cash);
        }
        System.out.printf("\nитоговая сумма: %.2f ", cash);
    }
}



