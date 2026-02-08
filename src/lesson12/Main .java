package lesson12;

class Main {
    public static void main(String[] args) {
        //1) Создать примитивную переменную для целого числа и записать туда значение
        //2) Преобразовать примитивную переменную в совместимый класс обертку с помощью автоупаковки
        //3) Вывести в консоль сумму значений примитивной переменной и класса обертки
        int intNumber = 777;
        Integer integerNumber = intNumber;
        int sum = integerNumber + intNumber;
        System.out.println(sum);

        integerNumber.compareTo(intNumber); // 0 - при равенстве, 1 - если левое больше правого, -1 - если правое больше левого

        //1) Создать переменную примитивного типа для числа с цифрой после запятой
        double doubleNumber = 5.1;
        //2) Преобразовать переменную примитивного типа в совместимый класс-обертку с помощью автоупаковки
        Double objDoubleNumber = doubleNumber;
        //3) Преобразовать переменную ссылочного типа в не совместимый примитивный тип целого числа с помощью специального метода
        int intFromDouble = objDoubleNumber.intValue();
        //4) Преобразовать переменную ссылочного типа в новую примитивную переменную совместимого типа с помощью автораспаковки
        double newDoubleNumber = objDoubleNumber;
        //5) вывести в консоль сумму меньшего числа между (ссылочной переменной и примитивной переменной целового числа)
        // с примитивной переменной числа с цифрой после запятой
        //6) результат выводим в консоль
        int result = objDoubleNumber.compareTo((double) intFromDouble);
        if (result > 0) {
            System.out.println(objDoubleNumber + newDoubleNumber);
        } else if (result == 0) {
            System.out.println("objDoubleNumber и intFromDouble равны, техническим заданием не предусмотрена реализация для них");
        } else {
            System.out.println(intFromDouble + newDoubleNumber);
        }
    }
}
