package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class SilkRope extends Item {
    public SilkRope() {
        this.name = "SilkRope";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 5.0;
    }
}
