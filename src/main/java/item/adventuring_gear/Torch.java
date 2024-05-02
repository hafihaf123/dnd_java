package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Torch extends Item {
    public Torch() {
        this.name = "Torch";
        this.cost = new Coin(CoinType.CP, 1);
        this.weight = 1.0;
    }
}
