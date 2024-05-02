package main.java.item.tool;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class HerbalismKit extends Item {
    public HerbalismKit() {
        this.name = "HerbalismKit";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 3.0;
    }
}
