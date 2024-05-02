package main.java.item.tool;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class ThievesTools extends Item {
    public ThievesTools() {
        this.name = "ThievesTools";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 1.0;
    }
}
