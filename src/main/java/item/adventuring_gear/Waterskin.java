package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Waterskin extends Item {
    public Waterskin() {
        this.name = "Waterskin";
        this.cost = new Coin(CoinUnits.SP, 2);
        this.weight = 5.0;
    }
}
