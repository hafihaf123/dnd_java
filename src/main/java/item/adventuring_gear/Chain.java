package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Chain extends Item {
    public Chain() {
        this.name = "Chain";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 10.0;
    }
}
