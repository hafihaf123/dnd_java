package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Horn extends Item implements MusicalInstrument {
    public Horn() {
        this.name = "Horn";
        this.cost = new Coin(CoinUnits.GP, 3);
        this.weight = 2.0;
    }
}
