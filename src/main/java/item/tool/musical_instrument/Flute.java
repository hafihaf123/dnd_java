package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Flute extends Item implements MusicalInstrument {
    public Flute() {
        this.name = "Flute";
        this.cost = new Coin(CoinUnits.GP, 2);
        this.weight = 1.0;
    }
}
