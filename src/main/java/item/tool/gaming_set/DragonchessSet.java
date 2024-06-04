package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class DragonchessSet extends Item implements GamingSet {
    public DragonchessSet() {
        this.name = "DragonchessSet";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = new Weight(WeightUnits.LB, 0.5);
    }
}
