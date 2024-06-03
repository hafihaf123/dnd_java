package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Ink extends Item {
    public Ink() {
        this.name = "Ink";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 0.0;
    }
}
