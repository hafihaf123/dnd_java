package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class MagnifyingGlass extends Item {
    public MagnifyingGlass() {
        this.name = "MagnifyingGlass";
        this.cost = new Coin(CoinUnits.GP, 100);
        this.weight = 0.0;
    }
}
