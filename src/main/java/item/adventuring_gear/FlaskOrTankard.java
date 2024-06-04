package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class FlaskOrTankard extends Item {
    public FlaskOrTankard() {
        this.name = "FlaskOrTankard";
        this.cost = new Coin(CoinUnits.CP, 2);
        this.weight = new Weight(WeightUnits.LB, 1.0);
    }
}
