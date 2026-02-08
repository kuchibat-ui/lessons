package lesson7;

import java.util.Scanner;

public class CheapTripController {
    public static void start() {
        CheapTripDB db = new CheapTripDB();
        boolean isAlive = true;
        while (isAlive) {
            System.out.println("Добрый день! Я ваш персональный гид.");
            System.out.println("выберите фильтр, по которому вы хотите искать туры.");
            System.out.println("1 - поиск туров по стране.");
            System.out.println("2 - поиск туров по городу.");
            System.out.println("3 - поиск туров по цене.");
            System.out.println("4 -  поиск по цене и звездам");
            System.out.println("5 -  показать весь список туров");
            System.out.println("0 -  выход");

            Scanner scanner = new Scanner(System.in);
            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 1) {
                System.out.println("Введите страну, куда вы хотите поехать.");
                String country = scanner.nextLine();
                db.searchByCountry(country);

            } else if (userChoice == 2) {
                System.out.println("Введите город, куда вы хотите поехать.");
                String city = scanner.nextLine();
                db.searchByCity(city);

            } else if (userChoice == 3) {
                System.out.println("Введите цену ");
                int from = scanner.nextInt();
                int to = scanner.nextInt();
                db.searchByPrice(from, to);

            } else if (userChoice == 5) {
                db.searchAll();

            } else if (userChoice == 4) {
                System.out.println("введите цену");
                int priceFrom = scanner.nextInt();
                int priceTo = scanner.nextInt();
                System.out.println("введите количество звезд");
                int stars = scanner.nextInt();
                db.searchByStarsAndPrice(priceFrom, priceTo, stars);
            } else {
                isAlive = false;
            }
            System.out.println();
        }
    }
}