package lesson171;

public class FridgeExample {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Банан", 200);
        fridge.addProduct("Масло", 500);
        fridge.addProduct("Банан", 400);
        fridge.addProduct("Йогурт", 150);
        fridge.addProduct("Колбаса", 1000);

        System.out.println("\nВывести все продукты (название + вес) по алфавиту от Я до А");
        fridge.printAllProductsFromZToA();
        fridge.minWeight();
        fridge.maxWeight();
        fridge.min();

    }
}
