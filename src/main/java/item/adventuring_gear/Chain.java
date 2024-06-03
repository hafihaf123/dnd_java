package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Chain extends Item {
    public Chain() {
        this.name = "Chain";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 10.0;
    }
}
