package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class ThreeDragonAnteSet extends Item implements GamingSet {
    public ThreeDragonAnteSet() {
        this.name = "ThreeDragonAnteSet";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 0.0;
    }
}
