package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class HempenRope extends Item {
    public HempenRope() {
        this.name = "HempenRope";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 10.0;
    }
}