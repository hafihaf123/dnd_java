package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Bedroll extends Item {
    public Bedroll() {
        this.name = "Bedroll";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 7.0;
    }
}
