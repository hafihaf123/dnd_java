package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Parchment extends Item {
    public Parchment() {
        this.name = "Parchment";
        this.cost = new Coin(CoinType.SP, 1);
        this.weight = 0.0;
    }
}
