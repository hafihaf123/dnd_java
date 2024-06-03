package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Crystal extends Item implements ArcaneFocus {
    public Crystal() {
        this.name = "Crystal";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = 1.0;
    }
}
