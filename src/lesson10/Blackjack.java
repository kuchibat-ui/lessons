package lesson10;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
    private Deck deck = new Deck();
    private Dealer dealer = new Dealer();
    private ArrayList<Player> players = new ArrayList<>();


    public void start(int playersQuantity) {
        if (playersQuantity < 1) {
            System.out.println("Нельзя создать игру на " + playersQuantity + " игроков. Укажите количество больше 0.");
            return;
        }

        if (playersQuantity > 5) {
            System.out.println("Нельзя создать игру на " + playersQuantity + " игроков. Укажите количество менее 6.");
            return;
        }

        System.out.println("Приветствуем тебя в игре блек джек");

        //1 - создание игроков
        Scanner scanner = new Scanner(System.in);
        players.add(dealer);
        for (int playerNumber = 1; playerNumber <= playersQuantity; playerNumber++) {
            System.out.println("Игрок " + playerNumber + ", введите свое имя:");
            String name = scanner.nextLine();
            Player player = new Player(name);
            players.add(player);
        }
        startGame();
        printResult();
    }
    public void startGame() {
        //2 - раздать всем по 2 карты
        for (Player player : players) {
            Card card1 = deck.getRandomCard();
            Card card2 = deck.getRandomCard();
            player.addCard(card1);
            player.addCard(card2);
        }

        //3 - раздать все остальные карты
        for (Player player : players) {
            while (player.doYouNeedMoreCard()) {
                Card card = deck.getRandomCard();
                player.addCard(card);
            }
        }
    }
    public void printResult() {
        //4 - напечатать у кого сколько очков
        for (Player player : players) {
            System.out.printf("Игрок %s набрал %d очков", player, player.getPoints());
        }

        //5 - определить и объявить победителя
        int maxPoints = 0;
        for (Player player : players) {
            int playerPoints = player.getPoints();
            if (playerPoints > maxPoints && playerPoints <= 21) {
                maxPoints = player.getPoints();
            }
        }

        if (dealer.getPoints() == maxPoints) {
            System.out.println("Дилер выиграл");
            return;
        }

        for (Player player : players) {
            if (player.getPoints() == maxPoints) {
                System.out.println("игрок с именем " + player.getName() + " победил");
            }
        }
    }
}