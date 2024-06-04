package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.DruidicFocus;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Totem extends Item implements DruidicFocus {
    public Totem() {
        this.name = "Totem";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = new Weight(WeightUnits.LB, 0.0);
    }
}
