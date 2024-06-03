package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class HempenRope extends Item {
    public HempenRope() {
        this.name = "HempenRope";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 10.0;
    }
}
