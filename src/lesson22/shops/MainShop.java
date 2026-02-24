package lesson22.shops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainShop {
    public static void main(String[] args) {
        List<Shop> shops = new ArrayList<>();
        shops.add(new Shop("berezka", 22234.56, 108.56));
        shops.add(new Shop("ryabinka", 2786.56, 561.56));
        shops.add(new Shop("bolshoy", 12254.56, 15108.56));
        shops.add(new Shop("magnit", 255534.56, 188808.56));
        shops.add(new Shop("maloy", 22865.56, 1668.56));

        System.out.println("посчитать общий доход по всем магазинам" +
                "посчитать количество магазинов в сети" +
                "посчитать средний доход на каждый магазин сети" +
                "отсортировать магазины по доходности от большего к меньшему");


        long quantity = shops.stream()
                .count();
        System.out.println("\nколичество магазинов " + quantity);


        List<Double> total = shops.stream()
                .map(Shop::getIncome)
                .collect(Collectors.toList());
        Double totalIncome = total.stream()
                .mapToDouble(i -> i)
                .sum();
        System.out.println("общий доход по всем магазинам " + totalIncome);

        System.out.println("отсортировать магазины по доходности от большего к меньшему");
        List<Shop> shopIncome = shops.stream()
                .sorted()
                .collect(Collectors.toList());
        shopIncome.forEach(System.out::println);
//        System.out.println(shopIncome);



        shops.stream()
                .filter(shop -> ((shop.getIncome()) / (shop.getArea())) > 100)
                .forEach(System.out::println);


    }
}
