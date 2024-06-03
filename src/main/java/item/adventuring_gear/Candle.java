package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Candle extends Item {
    public Candle() {
        this.name = "Candle";
        this.cost = new Coin(CoinUnits.CP, 1);
        this.weight = 0.0;
    }
}
