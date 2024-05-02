package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Bucket extends Item {
    public Bucket() {
        this.name = "Bucket";
        this.cost = new Coin(CoinType.CP, 5);
        this.weight = 2.0;
    }
}
