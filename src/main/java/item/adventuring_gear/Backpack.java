package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Backpack extends Item {
    public Backpack() {
        this.name = "Backpack";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 5.0;
    }
}
