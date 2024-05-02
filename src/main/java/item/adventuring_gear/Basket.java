package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Basket extends Item {
    public Basket() {
        this.name = "Basket";
        this.cost = new Coin(CoinType.SP, 4);
        this.weight = 2.0;
    }
}
