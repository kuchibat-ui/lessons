package lesson3;

public class Test {
    public static void main(String[] args) {
        System.out.println("Задача 2. Выводить все дни с начала года до 15 дня в месяце, прекратить на 5 дне 6 месяца");
        for (int month = 1; month < 13; month++) {
            for (int day = 1; day < 31; day++) {
                if (day >= 15) {
                    break;
                }

                if (month == 6 && day == 5) {
                    return;
                }

                System.out.println("Месяц " + month + " день " + day);
            }
        }
    }
}
