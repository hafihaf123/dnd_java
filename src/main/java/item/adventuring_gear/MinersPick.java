package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class MinersPick extends Item {
    public MinersPick() {
        this.name = "MinersPick";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 10.0;
    }
}
