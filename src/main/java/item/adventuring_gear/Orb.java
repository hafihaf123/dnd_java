package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Orb extends Item implements ArcaneFocus {
    public Orb() {
        this.name = "Orb";
        this.cost = new Coin(CoinUnits.GP, 20);
        this.weight = 3.0;
    }
}
