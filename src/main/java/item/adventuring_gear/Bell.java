package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Bell extends Item {
    public Bell() {
        this.name = "Bell";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 0.0;
    }
}
