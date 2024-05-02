package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SealingWax extends Item {
    public SealingWax() {
        this.name = "SealingWax";
        this.cost = new Coin(CoinType.SP, 5);
        this.weight = 0.0;
    }
}
