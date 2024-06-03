package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Quiver extends Item {
    public Quiver() {
        this.name = "Quiver";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 1.0;
    }
}
