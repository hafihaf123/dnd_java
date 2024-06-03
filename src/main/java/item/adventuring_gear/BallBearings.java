package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class BallBearings extends Item {
    public BallBearings() {
        this.name = "BallBearings";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 2.0;
    }
}
