package main.java.item.container.containers;

import main.java.item.container.Container;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Basket extends Container {
    public Basket() {
        this.name = "Basket";
        this.cost = new Coin(CoinUnits.SP, 4);
        this.weight = new Weight(WeightUnits.LB, 2);
        this.capacity = new Weight(WeightUnits.LB, 40);
    }
}
