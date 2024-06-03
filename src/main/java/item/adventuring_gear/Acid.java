package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Acid extends Item {
    public Acid() {
        this.name = "Acid";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 1.0;
    }
}
