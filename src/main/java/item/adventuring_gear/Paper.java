package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Paper extends Item {
    public Paper() {
        this.name = "Paper";
        this.cost = new Coin(CoinType.SP, 2);
        this.weight = 0.0;
    }
}
