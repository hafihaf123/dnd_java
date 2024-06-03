package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class PotionOfHealing extends Item {
    public PotionOfHealing() {
        this.name = "PotionOfHealing";
        this.cost = new Coin(CoinUnits.GP, 50);
        this.weight = 0.5;
    }
}
