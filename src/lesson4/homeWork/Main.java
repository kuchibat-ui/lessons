package lesson4.homeWork;

public class Main {
    public static void main(String[] args) {
        System.out.println(" //Домашнее задание\n" +
                "        //1) Создать массив 6 на 6 сразу с числами (сразу с числами)\n" +
                "        //2) Перезаписать во все ячейки нули (0)\n" +
                "        //3) Вывести диагональ снизу вверх слева направо\n" +
                "        //4) Вывести в шахматном порядке");

        int[][] doubleArray = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 0, 1, 2},
                {3, 4, 5, 6, 7, 8},
                {9, 0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5, 6}
        };
        // вывод матрицы на консоль
        for (int line = 0; line < doubleArray.length; line++) {
            int[] lineSix = doubleArray[line];
            for (int column = 0; column < lineSix.length; column++) {
                System.out.print(doubleArray[line][column] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        // во все ячейки установлены нули
        for (int line = 0; line < doubleArray.length; line++) {
            int[] lineSix = doubleArray[line];
            for (int column = 0; column < lineSix.length; column++) {
                doubleArray[line][column] = 0;
                System.out.print(doubleArray[line][column] + " ");
            }
            System.out.println(" " + " ");
        }
        System.out.println("-----------------------------");

        // условия для вывода диагонали
        for (int line = 0; line < doubleArray.length; line++) {
            int[] lineSix = doubleArray[line];
            for (int column = 0; column < lineSix.length; column++) {
                if (line + column == 5) {
                    System.out.print(doubleArray[line][column] + " ");
                } else System.out.print(" ");
            }
            System.out.println(" " + " ");
        }
        System.out.println("----------------------");

        // вывод шахматном порядке
        for (int line = 0; line < doubleArray.length; line++) {
            int[] lineSix = doubleArray[line];
            for (int column = 0; column < lineSix.length; column++) {
                int sum = line + column;
                if (sum % 2 == 0) {
                    System.out.print(doubleArray[line][column] + " ");
                }
                System.out.print("" + " ");
            }
            System.out.println("" + " ");
        }
    }
}