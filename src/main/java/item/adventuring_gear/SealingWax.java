package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class SealingWax extends Item {
    public SealingWax() {
        this.name = "SealingWax";
        this.cost = new Coin(CoinUnits.SP, 5);
        this.weight = 0.0;
    }
}
