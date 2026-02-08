package lesson12.homeWork;

import java.util.ArrayList;

public class homeWork12 {
    public static void main(String[] args) {
//        Задание 1: Определение типов данных
//        Для каждого из приведенных ниже выражений определите, к какому типу данных оно
//        относится (примитивному или ссылочному):

        int x = 10;                // примитивный тип
        String str = "Hello";      // ссылочный тип
        boolean isTrue = true;     // примитивный тип
        double d = 3.14;           // примитивный тип
        Integer i = new Integer(20);   // ссылочный тип
        ArrayList<Integer> list = new ArrayList<>();  // ссылочный тип
        char c = 'a';              // примитивный тип
        float f = 2.718f;          // примитивный тип

//        Задание 2: Преобразования типов
//        Напишите код, который выполняет следующие преобразования:
//        Преобразуйте целое число int в строку String.
        int a = 9;
        String intToString = String.valueOf(a);
        System.out.println("переменная типа String " + intToString);

//        Преобразуйте строку String, содержащую числовое значение, в целочисленный тип int.
        int stringToInt = Integer.valueOf(intToString);
        System.out.println("переменная типа int " + stringToInt);

//        Преобразуйте вещественное число double в целое число int с потерей дробной части.
        double e = 3.14;
        int doubleToInt = (int) e;
        System.out.println("double " + e + " в целое число int с потерей дробной части =" + doubleToInt);

//        Преобразуйте массив целых чисел int[] в список ArrayList<Integer> с использованием
//        автоупаковки.
        int[] arrayInt = {25, 67, 88, 90, 31};
        ArrayList<Integer> array = new ArrayList<>();
        for (int index = 0; index < arrayInt.length; index++) {
            array.add(arrayInt[index]);
        }
        System.out.println("массив целых чисел int[] в список ArrayList<Integer> " + array);

//        Задание 3: Работа с классами-обёртками
//        Создайте программу, которая демонстрирует работу с классами-обёртками. Программа
//        должна выполнять следующее:
//        Создать объект класса Integer с помощью конструктора и методом valueOf().
//                Использовать метод equals() для сравнения двух объектов Integer.
//                Применить метод parseInt() для преобразования строки в целое число.

        // создание объекта типа Integer, с помощью метода valueOf()
        Integer intCreateMethod = Integer.valueOf(145);

        // создание второго объекта типа Integer, с помощью конструктора, аргументом передается int
        Integer intCreateConstructor = new Integer(145);

        // сравнение двух объектов методом equals(), передача булевой переменной и вывода ее в консоль
        boolean comparison = intCreateMethod.equals(intCreateConstructor);
        System.out.println(comparison);

        // вычисление суммы двух объектов, передача суммы к переменной типа String
        String sum = String.valueOf(intCreateConstructor + intCreateMethod);

        // применение метода parseInt(), для преобразования строки в целое число int и вывод ее в консоль
        int fromStrToInt = Integer.parseInt(sum);
        System.out.println(fromStrToInt);
    }
}
