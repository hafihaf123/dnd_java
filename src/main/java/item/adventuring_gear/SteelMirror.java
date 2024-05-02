package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class SteelMirror extends Item {
    public SteelMirror() {
        this.name = "SteelMirror";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 0.5;
    }
}
