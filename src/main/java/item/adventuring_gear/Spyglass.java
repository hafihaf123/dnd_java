package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Spyglass extends Item {
    public Spyglass() {
        this.name = "Spyglass";
        this.cost = new Coin(CoinType.GP, 1000);
        this.weight = 1.0;
    }
}
