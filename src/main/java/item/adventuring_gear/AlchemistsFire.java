package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class AlchemistsFire extends Item {
    public AlchemistsFire() {
        this.name = "AlchemistsFire";
        this.cost = new Coin(CoinType.GP, 50);
        this.weight = 1.0;
    }
}
