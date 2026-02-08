package lesson10;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Player {
    private final String name;
    protected ArrayList<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public boolean doYouNeedMoreCard() {
        if (getPoints()>21){
            System.out.println("вы перебрали и проиграли");
            return false;
        }

        System.out.println(name+ " ваши карты на руках");
        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println(name+" нужна ли вам дополнительная карта? Да/Yes/1, если нужна, Нет/No/2 если не нужна");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Да") ||
                input.equalsIgnoreCase("1");

    }

    public int getPoints() {
        int points=0;
        for (Card card : hand) {
            points += card.getNominal();
        }
        return points;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(hand, player.hand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hand);
    }

    @Override
    public String toString() {
        return String.format("Игрок - %s, карты на руках - %s]", name, hand);
    }


}

