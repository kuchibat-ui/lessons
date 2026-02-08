package lesson3;

public class Main {
    public static void main(String[] args) {
        int[] fac={1, 4, 2, 5, 78, 8, 4, 1, 5, 6, 98};

        for (int i=fac.length-1; i >=0 ; i--) {
            if (fac[i]%2==0){
                System.out.print(fac[i]+",");
            }
        }

        System.out.println("\nЗадача1. вывести на консоль все числа от 0 до 10, кроме 2 и 5");
        for (int number = 0; number <=10 ; number++) {
            if (number==2 || number==5){
                continue;    // проходка к следующей итеращии
            }
            System.out.print(number+",");
        }

        System.out.println("\nЗадача 2. Выводить все дни с начала года до 15 дня в месяце, прекратить на 5 дне 6 месяца");

        for (int month = 1; month <=12 ; month++) {
            for (int day = 1; day <=31 ; day++) {
                if (day>=15){
                    break;    // выход из цикла
                }
                if (month==6 && day==5){
                    return;   // выход из метода
                }
                System.out.println(month+" месяц "+day+" дней ");
            }
        }

    }
}
