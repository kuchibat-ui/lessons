package lesson12.homeWork;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Создать переменную примитивного типа для числа с цифрой после запятой
//2) Преобразовать переменную примитивного типа в совместимый класс-обертку с помощью автоупаковки
//3) Преобразовать переменную ссылочного типа в не совместимый примитивный тип целого числа с помощью специального метода
//4) Преобразовать переменную ссылочного типа в новую примитивную переменную совместимого типа с помощью автораспаковки
//5) вывести в консоль сумму меньшего числа между (ссылочной переменной и примитивной переменной целового числа)
// с примитивной переменной числа с цифрой после запятой
//6) результат выводим в консоль
        double doublNumber = 10.48;
        Double doble = doublNumber;
        int numberInt = doble.intValue();


        int random = 10;
        String str = String.valueOf(random);
        System.out.println(str);

        int backInt = Integer.valueOf(str);
        System.out.println(backInt);
        //Преобразуйте вещественное число double в целое число int с потерей дробной части.
        double x = 20.34;
        int y = (int) x;
        System.out.println(y);
        //*Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием автоупаковки.
        int[] arrayInt = {23, 45, 78, 99, 33};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arrayInt.length; i++) {
            arr.add(arrayInt[i]);

        }
        System.out.println(arr);

        Integer intCreateMethod = Integer.valueOf(145);
        Integer intCreateConstructor = new Integer(145);
        boolean comparison = intCreateMethod.equals(intCreateConstructor);
        System.out.println(comparison);
        String sum = String.valueOf(intCreateConstructor + intCreateMethod);
        int fromStrToInt = Integer.parseInt(sum);
        System.out.println(fromStrToInt);
    }
}

