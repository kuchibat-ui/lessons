package lesson18.functonExample;

import lesson16.Coin;

public class FunctionExample {
    public static void main(String[] args) {
        //Мы отправляем монеты транспортной компанией и заказчику предоставляем только нужну информацию о монете
        Coin coin = new Coin(5, 1999, "Золото", 2.5);
        System.out.println(coin);

        //Переводим объект монеты в короткий объект без лишней информации
        ShortCoin shortCoin = new CoinMapper().apply(coin);
        System.out.println(shortCoin);
    }
}
