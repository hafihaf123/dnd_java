package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Paper extends Item {
    public Paper() {
        this.name = "Paper";
        this.cost = new Coin(CoinUnits.SP, 2);
        this.weight = 0.0;
    }
}
