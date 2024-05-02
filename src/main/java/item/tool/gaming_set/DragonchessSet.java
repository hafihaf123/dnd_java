package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class DragonchessSet extends Item implements GamingSet {
    public DragonchessSet() {
        this.name = "DragonchessSet";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 0.5;
    }
}
