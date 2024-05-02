package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class BallBearings extends Item {
    public BallBearings() {
        this.name = "BallBearings";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 2.0;
    }
}
