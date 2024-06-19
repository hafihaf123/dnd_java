package main.java.item.container.containers;

import main.java.item.container.Container;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Pouch extends Container {
    public Pouch() {
        this.name = "Pouch";
        this.cost = new Coin(CoinUnits.SP, 5);
        this.weight = new Weight(WeightUnits.LB, 1);
        this.capacity = new Weight(WeightUnits.LB, 6);
    }
}
