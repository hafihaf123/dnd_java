package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class FishingTackle extends Item {
    public FishingTackle() {
        this.name = "FishingTackle";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 4.0;
    }
}
