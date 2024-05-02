package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class HealersKit extends Item {
    public HealersKit() {
        this.name = "HealersKit";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 3.0;
    }
}
