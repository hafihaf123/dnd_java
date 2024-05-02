package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Tinderbox extends Item {
    public Tinderbox() {
        this.name = "Tinderbox";
        this.cost = new Coin(CoinType.SP, 5);
        this.weight = 1.0;
    }
}
