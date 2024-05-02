package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class BasicPoison extends Item {
    public BasicPoison() {
        this.name = "BasicPoison";
        this.cost = new Coin(CoinType.GP, 100);
        this.weight = 0.0;
    }
}
