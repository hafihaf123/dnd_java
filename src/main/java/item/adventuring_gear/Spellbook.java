package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Spellbook extends Item {
    public Spellbook() {
        this.name = "Spellbook";
        this.cost = new Coin(CoinUnits.GP, 50);
        this.weight = 3.0;
    }
}
