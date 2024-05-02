package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Rations extends Item {
    public Rations() {
        this.name = "Rations";
        this.cost = new Coin(CoinType.SP, 5);
        this.weight = 2.0;
    }
}
