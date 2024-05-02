package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class MessKit extends Item {
    public MessKit() {
        this.name = "MessKit";
        this.cost = new Coin(CoinType.SP, 2);
        this.weight = 1.0;
    }
}
