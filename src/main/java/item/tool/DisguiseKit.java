package main.java.item.tool;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class DisguiseKit extends Item {
    public DisguiseKit() {
        this.name = "DisguiseKit";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 3.0;
    }
}
