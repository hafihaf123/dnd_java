package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class GlassBottle extends Item {
    public GlassBottle() {
        this.name = "GlassBottle";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 2.0;
    }
}
