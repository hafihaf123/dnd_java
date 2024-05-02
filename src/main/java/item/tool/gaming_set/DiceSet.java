package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class DiceSet extends Item implements GamingSet {
    public DiceSet() {
        this.name = "DiceSet";
        this.cost = new Coin(CoinType.SP, 1);
        this.weight = 0.0;
    }
}
