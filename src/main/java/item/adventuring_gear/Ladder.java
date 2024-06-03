package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Ladder extends Item {
    public Ladder() {
        this.name = "Ladder";
        this.cost = new Coin(CoinUnits.SP, 1);
        this.weight = 25.0;
    }
}
