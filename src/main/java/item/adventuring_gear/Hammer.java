package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Hammer extends Item {
    public Hammer() {
        this.name = "Hammer";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 3.0;
    }
}
