package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class IronPot extends Item {
    public IronPot() {
        this.name = "IronPot";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 10.0;
    }
}
