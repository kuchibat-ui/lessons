package practic20.function;

import lesson16.Coin;

import java.util.function.Function;

// функциональный интерфейс Function который принимает на вход объект и выдает на выход другой объект
public class CoinMapper implements Function<Coin,ShortCoin> {

    @Override
    public ShortCoin apply(Coin coin) {
        return new ShortCoin(coin.getNominal(), coin.getMetalName());
    }
}
