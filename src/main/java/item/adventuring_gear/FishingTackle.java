package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class FishingTackle extends Item {
    public FishingTackle() {
        this.name = "FishingTackle";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 4.0;
    }
}