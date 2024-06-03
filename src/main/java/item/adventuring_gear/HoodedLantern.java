package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class HoodedLantern extends Item {
    public HoodedLantern() {
        this.name = "HoodedLantern";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 2.0;
    }
}
