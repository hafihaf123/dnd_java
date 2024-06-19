package main.java.item.container.containers;

import main.java.item.container.Container;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Chest extends Container {
    public Chest() {
        this.name = "Chest";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = new Weight(WeightUnits.LB, 25);
        this.capacity = new Weight(WeightUnits.LB, 300);
    }
}
