package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.AmmunitionAdventuringGear;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class CrossbowBolts extends Item implements AmmunitionAdventuringGear {
    public CrossbowBolts() {
        this.name = "CrossbowBolts";
        this.cost = new Coin(CoinUnits.GP, 1);
        this.weight = 1.5;
    }
}
