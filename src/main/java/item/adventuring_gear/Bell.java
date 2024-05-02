package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Bell extends Item {
    public Bell() {
        this.name = "Bell";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 0.0;
    }
}
