package main.java.item.tool;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class ForgeryKit extends Item {
    public ForgeryKit() {
        this.name = "ForgeryKit";
        this.cost = new Coin(CoinType.GP, 15);
        this.weight = 5.0;
    }
}
