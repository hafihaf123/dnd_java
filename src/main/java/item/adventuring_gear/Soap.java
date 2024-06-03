package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Soap extends Item {
    public Soap() {
        this.name = "Soap";
        this.cost = new Coin(CoinUnits.CP, 2);
        this.weight = 0.0;
    }
}
