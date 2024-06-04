package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class ThreeDragonAnteSet extends Item implements GamingSet {
    public ThreeDragonAnteSet() {
        this.name = "ThreeDragonAnteSet";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = new Weight(WeightUnits.LB, 0.0);
    }
}
