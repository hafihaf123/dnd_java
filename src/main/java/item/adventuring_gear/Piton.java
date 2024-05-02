package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Piton extends Item {
    public Piton() {
        this.name = "Piton";
        this.cost = new Coin(CoinType.CP, 5);
        this.weight = 0.25;
    }
}
