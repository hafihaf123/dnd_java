package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Oil extends Item {
    public Oil() {
        this.name = "Oil";
        this.cost = new Coin(CoinUnits.SP, 1);
        this.weight = new Weight(WeightUnits.LB, 1.0);
    }
}
