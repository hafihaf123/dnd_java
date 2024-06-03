package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Whetstone extends Item {
    public Whetstone() {
        this.name = "Whetstone";
        this.cost = new Coin(CoinUnits.CP, 1);
        this.weight = 1.0;
    }
}
