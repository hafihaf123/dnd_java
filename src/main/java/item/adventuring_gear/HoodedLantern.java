package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class HoodedLantern extends Item {
    public HoodedLantern() {
        this.name = "HoodedLantern";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
