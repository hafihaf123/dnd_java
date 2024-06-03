package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class ThreeDragonAnteSet extends Item implements GamingSet {
    public ThreeDragonAnteSet() {
        this.name = "ThreeDragonAnteSet";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 0.0;
    }
}
