package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class InkPen extends Item {
    public InkPen() {
        this.name = "InkPen";
        this.cost = new Coin(CoinUnits.CP, 2);
        this.weight = 0.0;
    }
}
