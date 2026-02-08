package lesson171;

import java.util.*;

import static java.lang.Integer.*;

public class Fridge {
    private Map<String, Integer> products = new HashMap<>();


    /**
     * Положить продукт в холодильник
     *
     * @param product
     * @param weight
     */
    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            products.put(product, currentWeight + weight);
        } else {
            products.put(product, weight);
        }
    }

    /**
     * вывод всех продуктов от Я до А
     */
    public void printAllProductsFromZToA() {
        Set<String> productNames = new TreeSet<>(Comparator.reverseOrder());
        productNames.addAll(products.keySet());
        productNames.forEach(productName -> System.out.println(productName + " - " + products.get(productName)));

        //То же самое
//        for (String productName : productNames) {
//            System.out.println(productName + " - " + products.get(productName));
//        }
    }

    /**
     * выдача продукта из холодильника
     *
     * @param product
     * @param weight
     */
    public void takeProductFromFridge(String product, int weight) {
        if (products.containsKey(product)) {                //проверяем наличие продукта в холодильнике
            int currentWeight = products.get(product);      //если он есть, узнаем его вес. присваеваем его переменной

            if (currentWeight >= weight) {                  //если текущий вес продукта больше запрашиваемого, то
                int nominalWeight = currentWeight - weight;
                products.put(product, nominalWeight);       //выдаем пользователю, столько сколько запросил
                System.out.println(product + " выдано " + weight + " осталось в холодильнике " + nominalWeight);
                if (nominalWeight == 0)                      //если после того как забрали продукт и там ничего не осталось
                    products.remove(product);                //удаляем продукт из МАПЫ
            } else System.out.println(product + " есть, но его недостаточно");    //если запрос большего существующего
        } else {
            System.out.println(product + " в холодильнике нет");             //если продукта нет вообще
        }
    }


    /**
     * вывод вес продукта в холодильнике
     *
     * @param product
     */
    public void printWeightProduct(String product) {
        if (products.containsKey(product)) {
            int currentWeight = products.get(product);
            System.out.println("вес " + product + currentWeight);
        }
    }


    /**
     * вес всех продуктов в холодильнике
     */
    public void printAllWeightProducts() {
        int sum = 0;
        for (Integer value : products.values()) {
            sum += value;
        }
        System.out.println("общий вес в холодильнике " + sum);
    }

    /**
     * вывести продукт который закончится скоро
     */
    public void minWeight() {
        Set<Map.Entry<String, Integer>> cell = products.entrySet();             // получение всех ячеек из products

        int min = 10000;                                                        // условный вес
        for (Map.Entry<String, Integer> weight : products.entrySet()) {         // цикл, для нахождения минимума веса
            int x = weight.getValue();                                          // продукта
            if (x <= min) {
                min = x;
            }
        }
        for (Map.Entry<String, Integer> pair : cell) {
            if (min == pair.getValue()) {                                       // условие для поиска из списка минимума
                System.out.println(pair.getKey());                              // возвращаем  ключ
            }
        }

    }


    /**
     * вывести продукт которого больше всего
     */
    public void maxWeight() {


        int max = 0;                                                        // условный вес
        for (Map.Entry<String, Integer> weight : products.entrySet()) {         // цикл, для нахождения минимума веса
            int x = weight.getValue();                                          // продукта
            if (x >= max) {
                max = x;
            }
        }
        Set<Map.Entry<String, Integer>> cell = products.entrySet();
        for (Map.Entry<String, Integer> pair : cell) {
            if (max == pair.getValue()) {                                       // условие для поиска из списка минимума
                System.out.println(pair.getKey());                              // возвращаем  ключ
            }
        }


    }
public  void min(){
        int minimum = Collections.min(products.values());
    for (Map.Entry<String, Integer> cell : products.entrySet()) {
        if (cell.getValue()==minimum){
            System.out.println(cell.getKey());
        }
    }
}

    }

