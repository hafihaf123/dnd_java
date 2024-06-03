package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Lock extends Item {
    public Lock() {
        this.name = "Lock";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 1.0;
    }
}
