package practic20.function;

import lesson16.Coin;

public class FunctionExample {
    public static void main(String[] args) {
        Coin coin = new Coin(5,1999,"gold",2.3);

        //переводим в объект(Entity) монеты без лишней информации (в DTO) маппинг данных
        ShortCoin shortCoin = new ShortCoin(coin.getNominal(),coin.getMetalName()); //маппинг
        System.out.println(shortCoin);


        //тоже самое только с использованием CoinMapper
        CoinMapper coinMapper = new CoinMapper();
        ShortCoin shortCoin1 = coinMapper.apply(coin);
        System.out.println(shortCoin1);
    }
}
