package lesson4.samWork;

public class Main {
    public static void main(String[] args) {
//        int[] number = new int[11];
//        for (int index = 1; index < number.length; index++) {
////            number[index]=index+1;
//            System.out.println(index);
//        }
//
//        //2) Есть массив цифр {3, 5, 8, 33, 55, 4, 1, 65, 36, 98}
//        // а) Вывести его на консоль с обратной стороны
//        // б) только те числа, которые содержат цифру 5
//
//        int[] randomNum = {3, 5, 8, 33, 55, 4, 1, 65, 36, 98};
//        for (int index = randomNum.length - 1; index >= 0; index--) {
//            int num = randomNum[index];
//            String sum = String.valueOf(num);
//            if (sum.contains("5")) {
//
//                System.out.println(sum);
//            }
//        }
//
//        // Создать двумерный массив с числами и вывести на консоль
//        int[][] array = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        System.out.println(array[0][2]);

        //создание двумерного пустого массива
//        int[][]emptyArray=new int[5][10];
//        for (int verticalIndex = 0; verticalIndex <emptyArray.length ; verticalIndex++) {
//            int[] nestedArray=emptyArray[verticalIndex];
//            for (int horizontalIndex = 0; horizontalIndex <nestedArray.length ; horizontalIndex++) {
//                System.out.print(nestedArray[horizontalIndex]+" ");
//            }
//            System.out.println(" ");
//        }

//        int[][] test = new int[5][10];
//        for (int index = 0; index < test.length; index++) {
//            for (int i = 0; i < test[index].length; i++) {
//                System.out.print(test[index][i] + " ");
//            }
//            System.out.println("");
//        }

        //Домашнее задание
        //1) Создать массив 6 на 6 сразу с числами (сразу с числами)
        //2) Перезаписать во все ячейки нули (0)
        //3) Вывести диагональ снизу вверх слева направо
        //4) Вывести в шахматном порядке

        int[][] doubleArray = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 0, 1, 2},
                {3, 4, 5, 6, 7, 8},
                {9, 0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5, 6}
        };
        for (int i = 0; i < doubleArray.length; i++) {
            int[] lineSix = doubleArray[i];
            for (int j = 0; j < lineSix.length; j++) {
                doubleArray[i][j]=0;
                if (i + j == 5 && j%2==1) {
                    System.out.print(doubleArray[i][j] + " ");
                } else {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();


        }

//        int i = 5;
//        int j = 0;
//        for (int count = 0; count < 6; count++) {
//            System.out.println(String.valueOf(doubleArray[i - count][j + count]));
//        }

//        int[]empty={13,5,8,33,55,4,1,65,36,98};
//        for (int index =empty.length-1; index>=0; index--) {
//           int count= empty[index];
//            String number=String.valueOf(count);
//            if (number.contains("5")) {
//                System.out.print(count+"  ");
//            }
//
       }

    }

