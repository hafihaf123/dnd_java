package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Parchment extends Item {
    public Parchment() {
        this.name = "Parchment";
        this.cost = new Coin(CoinUnits.SP, 1);
        this.weight = 0.0;
    }
}
