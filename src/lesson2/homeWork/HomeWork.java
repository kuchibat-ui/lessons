package lesson2.homeWork;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(" Домашнее задание\n" +
                "        вклад на сумму 1 миллион 200 тысяч рублей\n" +
                "        Срок вклада 1 год\n" +
                "        Вариант 1 - с ежемесячной капитализацией по ставке 22%\n" +
                "        Вариант 2 - с начислением процентов в конце срока по ставке 22,5%\n" +
                "        1) Определить, какая сумма у вас накопится к концу сроку вклада по обоим вариантам\n" +
                "        2) Выбрать наиболее выгодный\n" +
                "        3) Вывести результаты в консоль");

        // вводные данные со сложным процентом
        double money = 1_200_000;
        double percentWithCapital = 22;

        for (int month = 1; month <= 12; month++) {
            money = money + money * (percentWithCapital / 12) / 100;
            System.out.printf("\nначислено в " + month + "-й месяц: %.2f", money);
        }
        System.out.printf("\nитого за весь год по капитализации: %.2f", money);


        // вводные данные с простым процентом
        double cash = 1_200_000;
        double percentEasy = 22.5;

        cash = cash + cash * percentEasy / 100;
        System.out.printf("\nитого за весь год по простому проценту: %.2f", cash);


        // сравнение вкладов и вывод результата
        if (money > cash) {
            System.out.println("\nвклад под процент с ежемесячной капитализацией в "+percentWithCapital+"% в год выгодней");
        } else {
            System.out.println("\nвклад под простой процент в "+percentEasy+"% в год выгодней ");
        }
    }
}
