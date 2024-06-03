package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class ClimbersKit extends Item {
    public ClimbersKit() {
        this.name = "ClimbersKit";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 12.0;
    }
}
