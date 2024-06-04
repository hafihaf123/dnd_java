package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class BullseyeLantern extends Item {
    public BullseyeLantern() {
        this.name = "BullseyeLantern";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
