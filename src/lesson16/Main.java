package lesson16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin2 = new Coin(5, 1999, "Золото", 2.5);
        Coin coin3 = new Coin(10, 1990, "Золото", 2.5);
        Coin coin4 = new Coin(50, 1899, "Олово", 5);
        Coin coin5 = new Coin(5, 1869, "Серебро", 10);
        Coin coin6 = new Coin(5, 1869, "Палладий", 10);
        Coin coin7 = new Coin(7, 1869, "Палладий", 15);
        Coin coin8 = new Coin(7, 1899, "Аллюминий", 5);

        System.out.println("Вариант 1 - используем сортировку по умолчанию (compareTo)");
        Set<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);
        coins.add(coin6);
        coins.add(coin7);
        coins.add(coin8);

        for (Coin coin : coins) {
            System.out.println(coin);
        }
        System.out.println("-------------------------");

        System.out.println("Вариант 2 - используем внешний сортировщик");
        Set<Coin> coins2 = new TreeSet<>(new SortByYearComparator());
        coins2.addAll(coins);

        for (Coin coin : coins2) {
            System.out.println(coin);
        }
        System.out.println("------------------------");

        System.out.println("Вариант 3 - используем анонимный класс");
        Set<Coin> coins3 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                // сортируем по металлу по убыванию
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }

                //потом сортируем погоду по возрастанию
                if (o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                //потом сортируем по номиналу по убыванию
                if (o1.getNominal() != o2.getNominal()) {
                    return o1.getNominal() - o2.getNominal();
                }

                //потом сортируем по диаметру по возрастанию
                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }

                return 0;
            }
        });

        coins3.addAll(coins);

        for (Coin coin : coins3) {
            System.out.println(coin);
        }
        System.out.println("----------------------");

        System.out.println("Вариант 4 - используем новый компаратор NewSortComparator");
        Set<Coin> coins4 = new TreeSet<>(new NewSortComparator());
        coins4.addAll(coins);

        for (Coin coin : coins4) {
            System.out.println(coin);
        }
        System.out.println("-----------------------");

        System.out.println("Вариант 5 - используем анонимный класс сравнитель");
        Set<Coin> coins5 = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                //сортировка по металлу от Я до А
                if (!o1.getMetalName().equals(o2.getMetalName())) {
                    return o2.getMetalName().compareTo(o1.getMetalName());
                }

                //сортировка по номиналу от большего к меньшему
                if (o1.getNominal() != o2.getNominal()) {
                    return o2.getNominal() - o1.getNominal();
                }

                //сортировка по диаметру от меньшего к большему
                if (o1.getDiameter() != o2.getDiameter()) {
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }

                return 0;
            }
        });
        coins5.addAll(coins);

        for (Coin coin : coins5) {
            System.out.println(coin);
        }
    }
}