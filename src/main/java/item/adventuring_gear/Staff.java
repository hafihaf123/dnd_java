package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Staff extends Item implements ArcaneFocus {
    public Staff() {
        this.name = "Staff";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 4.0;
    }
}
