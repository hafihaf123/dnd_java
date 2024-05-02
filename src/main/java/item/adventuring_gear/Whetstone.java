package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Whetstone extends Item {
    public Whetstone() {
        this.name = "Whetstone";
        this.cost = new Coin(CoinType.CP, 1);
        this.weight = 1.0;
    }
}
