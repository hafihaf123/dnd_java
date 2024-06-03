package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.AmmunitionAdventuringGear;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class SlingBullets extends Item implements AmmunitionAdventuringGear {
    public SlingBullets() {
        this.name = "SlingBullets";
        this.cost = new Coin(CoinUnits.CP, 4);
        this.weight = 1.5;
    }
}
