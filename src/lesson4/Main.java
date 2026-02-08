package lesson4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создать пустой массив на 10 ячеек для целых чисел и прочитать его значения");
        int[] emptyArray = new int[10];
        for (int index = 0; index < emptyArray.length; index++) {
            System.out.println(emptyArray[index]);
        }

        //1) Заполнить этот же массив числами от 1 до 10
        for (int index = 0; index < emptyArray.length; index++) {
            emptyArray[index] = index + 1;
            System.out.println(emptyArray[index]);
        }

        //2) Есть массив цифр {3, 5, 8, 33, 55, 4, 1, 65, 36, 98}
        // а) Вывести его на консоль с обратной стороны
        // б) только те числа, которые содержат цифру 5
        int[] randomArray = {3, 5, 8, 33, 55, 4, 1, 65, 36, 98};
        for (int index = randomArray.length - 1; index >= 0; index--) {
            int number = randomArray[index];
            String stringNumber = String.valueOf(number);
            if (stringNumber.contains("5")) {
                System.out.println(stringNumber);
            }
        }

        System.out.println("\n Создать двумерный массив с числами и вывести на консоль");
        int[][] numbers = {
                {1, 2, 3},
                {3, 5, 6},
                {5, 3, 2},
                {1, 4, 5}
        };

        //Чтобы достать цифру 3
        System.out.println(numbers[0][2]);
        //Чтобы достать цифру 4
        System.out.println(numbers[3][1]);

        System.out.println("\n Создание пустого двумерного массива");
        int[][] emptyArray2 = new int[10][10];

        System.out.println("\n Вывод всех элементов на консоль");
        //цикл по массиву emptyArray2 по вертикали (сверху вниз) или по строкам
        for (int verticalIndex = 0; verticalIndex < emptyArray2.length; verticalIndex++) {
            //Достаем строку
            int[] nestedArray = emptyArray2[verticalIndex];
            //Цикл по строке слева направо по горизонтали
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                //печать в консоль содержимого ячейки строки без переноса на новую строку
                System.out.print(nestedArray[horizontalIndex] + " ");
            }
            //перенос на новую строку
            System.out.println();
        }

        System.out.println("\n Вывод диагонали сверху вниз слева направо");
        for (int verticalIndex = 0; verticalIndex < emptyArray2.length; verticalIndex++) {
            int[] nestedArray = emptyArray2[verticalIndex];
            for (int horizontalIndex = 0; horizontalIndex < nestedArray.length; horizontalIndex++) {
                if (verticalIndex == horizontalIndex) {
                    System.out.print(nestedArray[horizontalIndex] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
