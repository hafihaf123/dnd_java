package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Wand extends Item implements ArcaneFocus {
    public Wand() {
        this.name = "Wand";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 1.0;
    }
}
