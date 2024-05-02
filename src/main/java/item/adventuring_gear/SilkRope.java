package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SilkRope extends Item {
    public SilkRope() {
        this.name = "SilkRope";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 5.0;
    }
}
