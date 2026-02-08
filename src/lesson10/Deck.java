package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>(List.of(
            new Card(2, "Двойка крести"),
            new Card(2, "Двойка бубна"),
            new Card(2, "Двойка пика"),
            new Card(2, "Двойка черви"),
            new Card(3, "Тройка крести"),
            new Card(3, "Тройка бубна"),
            new Card(3, "Тройка пика"),
            new Card(3, "Тройка черви"),
            new Card(4, "Четверка крести"),
            new Card(4, "Четверка бубна"),
            new Card(4, "Четверка пика"),
            new Card(4, "Четверка черви"),
            new Card(5, "Пятерка крести"),
            new Card(5, "Пятерка бубна"),
            new Card(5, "Пятерка пика"),
            new Card(5, "Пятерка черви"),
            new Card(6, "Шестерка крести"),
            new Card(6, "Шестерка бубна"),
            new Card(6, "Шестерка пика"),
            new Card(6, "Шестерка черви"),
            new Card(7, "Семерка крести"),
            new Card(7, "Семерка бубна"),
            new Card(7, "Семерка пика"),
            new Card(7, "Семерка черви"),
            new Card(8, "Восьмерка крести"),
            new Card(8, "Восьмерка бубна"),
            new Card(8, "Восьмерка пика"),
            new Card(8, "Восьмерка черви"),
            new Card(9, "Девятка крести"),
            new Card(9, "Девятка бубна"),
            new Card(9, "Девятка пика"),
            new Card(9, "Девятка черви"),
            new Card(10, "Десятка крести"),
            new Card(10, "Десятка бубна"),
            new Card(10, "Десятка пика"),
            new Card(10, "Десятка черви"),
            new Card(2, "Валет крести"),
            new Card(2, "Валет бубна"),
            new Card(2, "Валет пика"),
            new Card(2, "Валет черви"),
            new Card(3, "Дама крести"),
            new Card(3, "Дама бубна"),
            new Card(3, "Дама пика"),
            new Card(3, "Дама черви"),
            new Card(4, "Король крести"),
            new Card(4, "Король бубна"),
            new Card(4, "Король пика"),
            new Card(4, "Король черви"),
            new Card(11, "Туз крести"),
            new Card(11, "Туз бубна"),
            new Card(11, "Туз пика"),
            new Card(11, "Туз черви")
    ));

    Random rand = new Random();
    /**
     * метод выдает карту из колоды
     * @return одну карту
     */
    public Card getRandomCard() {
        int indexCell = rand.nextInt(cards.size());
        return cards.remove(indexCell);
    }
}
