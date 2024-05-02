package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class InkPen extends Item {
    public InkPen() {
        this.name = "InkPen";
        this.cost = new Coin(CoinType.CP, 2);
        this.weight = 0.0;
    }
}
