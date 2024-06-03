package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Robes extends Item {
    public Robes() {
        this.name = "Robes";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 4.0;
    }
}
