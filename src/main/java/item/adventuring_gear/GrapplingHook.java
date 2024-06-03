package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class GrapplingHook extends Item {
    public GrapplingHook() {
        this.name = "GrapplingHook";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 4.0;
    }
}
