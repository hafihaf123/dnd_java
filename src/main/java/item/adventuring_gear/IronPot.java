package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class IronPot extends Item {
    public IronPot() {
        this.name = "IronPot";
        this.cost = new Coin(CoinType.GP, 2);
        this.weight = 10.0;
    }
}
