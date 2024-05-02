package main.java.item.tool;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class PoisonersKit extends Item {
    public PoisonersKit() {
        this.name = "PoisonersKit";
        this.cost = new Coin(CoinType.GP, 50);
        this.weight = 2.0;
    }
}
