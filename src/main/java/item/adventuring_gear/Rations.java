package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Rations extends Item {
    public Rations() {
        this.name = "Rations";
        this.cost = new Coin(CoinUnits.SP, 5);
        this.weight = 2.0;
    }
}
