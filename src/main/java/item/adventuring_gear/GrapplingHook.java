package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class GrapplingHook extends Item {
    public GrapplingHook() {
        this.name = "GrapplingHook";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = new Weight(WeightUnits.LB, 4.0);
    }
}
