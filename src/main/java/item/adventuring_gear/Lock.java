package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Lock extends Item {
    public Lock() {
        this.name = "Lock";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 1.0;
    }
}
