package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class PotionOfHealing extends Item {
    public PotionOfHealing() {
        this.name = "PotionOfHealing";
        this.cost = new Coin(CoinType.GP, 50);
        this.weight = 0.5;
    }
}
