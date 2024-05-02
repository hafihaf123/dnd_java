package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class BullseyeLantern extends Item {
    public BullseyeLantern() {
        this.name = "BullseyeLantern";
        this.cost = new Coin(CoinType.GP, 10);
        this.weight = 2.0;
    }
}
