package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class GlassBottle extends Item {
    public GlassBottle() {
        this.name = "GlassBottle";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
