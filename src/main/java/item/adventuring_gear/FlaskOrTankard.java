package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class FlaskOrTankard extends Item {
    public FlaskOrTankard() {
        this.name = "FlaskOrTankard";
        this.cost = new Coin(CoinUnits.CP, 2);
        this.weight = 1.0;
    }
}
