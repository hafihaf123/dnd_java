package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Caltrops extends Item {
    public Caltrops() {
        this.name = "Caltrops";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 2.0;
    }
}
