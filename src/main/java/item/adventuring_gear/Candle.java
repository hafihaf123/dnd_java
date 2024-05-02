package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Candle extends Item {
    public Candle() {
        this.name = "Candle";
        this.cost = new Coin(CoinType.CP, 1);
        this.weight = 0.0;
    }
}
