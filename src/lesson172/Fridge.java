package lesson172;

import java.util.*;

public class Fridge {
    private final Map<String, Integer> products = new HashMap<>();

    //Положить продукт в холодильник
    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    //Взять продукт из холодильника
    public void takeProduct(String product, int needWeight) {
        if (!products.containsKey(product)) {
            System.out.println("Продукт " + product + " отсутствуют в холодильнике");
            return;
        }

        int currentWeight = products.get(product);
        if (currentWeight < needWeight) {
            System.out.println("Недостаточно продукта " + product + ". Доступно: " + currentWeight);
            return;
        }

        int newWeight = currentWeight - needWeight;
        if (newWeight == 0) {
            products.remove(product);
        } else {
            products.put(product, newWeight);
        }

        System.out.println("Взято " + needWeight + " единиц продукта " + product + " ");
    }

    //Вывести вес всех продуктов в холодильнике(сумма)
    public void printTotalWeight() {
        int totalWeight = 0;
        for (int weight : products.values()) {
            totalWeight += weight;
        }

        System.out.println("Общий вес всех продуктов: " + totalWeight);
    }

    public void printAllProducts() {
        System.out.println("\nПродукты в холодильнике:");
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " г");
        }
    }

    public void printAllProductsFromZToA() {
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());
        productNames.forEach(productName -> System.out.println(productName + " - " + products.get(productName)));
    }

    public void printProductWeight(String product) {
        if (products.containsKey(product)) {
            System.out.println("Вес продукта: " + product + " - " + products.get(product));
        } else {
            System.out.println("\nПродукт \"" + product + "\" не найден в холодильнике");
        }
    }

    public void printFirstProductToFinish() {
        if (products.isEmpty()) {
            System.out.println("Холодильник пуст!");
        }

        int minWeight = Collections.min(products.values());
        for (String key : products.keySet()) {
            if (products.get(key) == minWeight) {
                System.out.println(key);
            }
        }
    }

    //Вывести наименование продукта, которого больше всего
    public void printProductsWithMaxWeight() {
        if (products.isEmpty()) {
            return;
        }

        int maxWeight = Collections.max(products.values());
        for (String key : products.keySet()) {
            if (products.get(key) == maxWeight) {
                System.out.println(key);
            }
        }
    }

    //Вывести все продукты (название + вес) по весу от большего к меньшему
    public void printProductsByWeightDesc() {
        List<Map.Entry<String, Integer>> sortedProducts = new ArrayList<>(products.entrySet());  // создается ArrayList из ячеек пар ключ-значение
        sortedProducts.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("\nПродукты по весу (от большего к меньшему):");
        for (Map.Entry<String, Integer> entry : sortedProducts) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "г");
        }
    }
}


