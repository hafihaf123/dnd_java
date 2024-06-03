package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class AlchemistsFire extends Item {
    public AlchemistsFire() {
        this.name = "AlchemistsFire";
        this.cost = new Coin(CoinUnits.GP, 50);
        this.weight = 1.0;
    }
}
