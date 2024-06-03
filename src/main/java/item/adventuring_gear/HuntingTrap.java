package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class HuntingTrap extends Item {
    public HuntingTrap() {
        this.name = "HuntingTrap";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 25.0;
    }
}
