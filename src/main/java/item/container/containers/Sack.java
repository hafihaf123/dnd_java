package main.java.item.container.containers;

import main.java.item.container.Container;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Sack extends Container {
    public Sack() {
        this.name = "Sack";
        this.cost = new Coin(CoinUnits.CP, 1);
        this.weight = new Weight(WeightUnits.LB, 0.5);
        this.capacity = new Weight(WeightUnits.LB, 30);
    }
}
