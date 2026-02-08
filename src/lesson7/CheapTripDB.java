package lesson7;

public class CheapTripDB {
    private Tour[] tours = {
            new Tour("Турция", "Стамбул", "Самолет", 5, 100_000, 3,
                    "Все включено"),
            new Tour("Турция", "Анталия", "Самолет", 7, 150_000, 5,
                    "только завтрак"),
            new Tour("Бельгия", "Антверпен", "Самолет", 5, 100_000, 3,
                    "Все включено"),
            new Tour("Грузия", "Тбилиси", "Поезд", 7, 50_000, 3,
                    "только завтрак"),
            new Tour("Германия", "Берлин", "Самолет", 7, 190_000, 3,
                    "Все включено"),
            new Tour("Франция", "Париж", "Самолет", 3, 150_000, 4,
                    "только завтрак")
    };

    public void searchByCountry(String country) {
        for (Tour tour : tours) {
            if (tour.getCountry().equalsIgnoreCase(country)) {
                System.out.println(tour);
            }
        }
    }

    public void searchByPrice(int from, int to) {
        for (Tour tour : tours) {
            if (from <= tour.getPrice() && tour.getPrice() <= to) {
                System.out.println(tour);
            }
        }
    }

    public void searchByCity(String city) {
        for (Tour tour : tours) {
            if (tour.getCity().equalsIgnoreCase(city)) {
                System.out.println(tour);
            }
        }
    }

    public void searchAll() {
        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    public void searchByStarsAndPrice(int priceFrom, int priceTo, int stars) {
        for (Tour tour : tours) {
            if (tour.getPrice() >= priceFrom && tour.getPrice() <= priceTo && tour.getStars() == stars) {
                System.out.println(tour);
            }
        }
    }
}