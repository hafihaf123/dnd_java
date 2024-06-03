package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class DragonchessSet extends Item implements GamingSet {
    public DragonchessSet() {
        this.name = "DragonchessSet";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 0.5;
    }
}
