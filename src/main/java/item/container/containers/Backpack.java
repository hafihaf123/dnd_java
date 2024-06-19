package main.java.item.container.containers;

import main.java.item.container.Container;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Backpack extends Container {
    public Backpack() {
        this.name = "Backpack";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = new Weight(WeightUnits.LB, 5);
        this.capacity = new Weight(WeightUnits.LB, 30);
    }
}
