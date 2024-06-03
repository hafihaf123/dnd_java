package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class SledgeHammer extends Item {
    public SledgeHammer() {
        this.name = "SledgeHammer";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 10.0;
    }
}
