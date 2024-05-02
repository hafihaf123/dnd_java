package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class ClimbersKit extends Item {
    public ClimbersKit() {
        this.name = "ClimbersKit";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 12.0;
    }
}
