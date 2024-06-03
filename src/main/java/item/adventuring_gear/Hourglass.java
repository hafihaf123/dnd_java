package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Hourglass extends Item {
    public Hourglass() {
        this.name = "Hourglass";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 1.0;
    }
}
