package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Sack extends Item {
    public Sack() {
        this.name = "Sack";
        this.cost = new Coin(CoinUnits.CP, 1);
        this.weight = 0.5;
    }
}
