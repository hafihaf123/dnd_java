package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Bedroll extends Item {
    public Bedroll() {
        this.name = "Bedroll";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 7.0;
    }
}
