package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class FlaskOrTankard extends Item {
    public FlaskOrTankard() {
        this.name = "FlaskOrTankard";
        this.cost = new Coin(CoinType.CP, 2);
        this.weight = 1.0;
    }
}
