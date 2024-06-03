package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Abacus extends Item {
    public Abacus() {
        this.name = "Abacus";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 2.0;
    }
}
