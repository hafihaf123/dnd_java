package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class MagnifyingGlass extends Item {
    public MagnifyingGlass() {
        this.name = "MagnifyingGlass";
        this.cost = new Coin(CoinType.GP, 100);
        this.weight = 0.0;
    }
}
