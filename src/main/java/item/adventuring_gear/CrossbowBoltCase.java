package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CrossbowBoltCase extends Item {
    public CrossbowBoltCase() {
        this.name = "CrossbowBoltCase";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 1.0;
    }
}
