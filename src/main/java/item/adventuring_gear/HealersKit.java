package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class HealersKit extends Item {
    public HealersKit() {
        this.name = "HealersKit";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = new Weight(WeightUnits.LB, 3.0);
    }
}
