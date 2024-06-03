package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class DiceSet extends Item implements GamingSet {
    public DiceSet() {
        this.name = "DiceSet";
        this.cost = new Coin(CoinUnits.SP, 1);
        this.weight = 0.0;
    }
}
