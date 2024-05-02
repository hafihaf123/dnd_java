package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Hourglass extends Item {
    public Hourglass() {
        this.name = "Hourglass";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 1.0;
    }
}
