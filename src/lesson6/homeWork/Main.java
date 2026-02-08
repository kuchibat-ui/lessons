package lesson6.homeWork;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Animal ("серого","Колбаса",0.35,"кот васька",4 , 2.5);
        Animal bear = new Animal("белого","лосось", 2.5,  "медведь мишка",4,150.2);
        Animal cat2 = new Animal ("серого","Колбаса",0.35,"кот васька",4 , 2.5);

        System.out.println("Знакомство с первым котом\n");
        cat2.toSpeak();
        cat2.toEat();
        cat2.toTellColor();
        cat2.toTellHeight();
        cat2.toTellWeight();
        cat2.toTellPaws();

        System.out.println("\nЗнакомство с медведем \n");
        bear.toSpeak();
        bear.toEat();
        bear.toTellColor();
        bear.toTellHeight();
        bear.toTellWeight();
        bear.toTellPaws();

        System.out.println("\nизменение полей FavoriteFood,Height,Weight,в экземпляре bear с помощью Сеттеров\n");
        bear.setFavoriteFood("килька");
        bear.setHeight(3);
        bear.setWeight(170);

        System.out.println("\nЗнакомство с медведем после изменения полей\n");
        bear.toSpeak();
        bear.toEat();
        bear.toTellColor();
        bear.toTellHeight();
        bear.toTellWeight();
        bear.toTellPaws();

        System.out.println("\nЗнакомство со вторым котом\n");
        cat2.toSpeak();
        cat2.toEat();
        cat2.toTellColor();
        cat2.toTellHeight();
        cat2.toTellWeight();
        cat2.toTellPaws();

        System.out.println("\nСравнение трех животных между собой\n");
        if (cat2.equals(bear)) {
            System.out.println(cat2 + " и " + bear + " близнецы");
        } else if (cat2.equals(cat1)) {
            System.out.println(cat2 + " и " + cat1 + " близнецы");
        } else if(cat1.equals(bear)){
            System.out.println(cat1+" и "+bear+" близнецы");
        } else
            System.out.println("все разные");
    }
}
