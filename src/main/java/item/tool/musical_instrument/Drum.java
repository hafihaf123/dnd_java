package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Drum extends Item implements MusicalInstrument {
    public Drum() {
        this.name = "Drum";
        this.cost = new Coin(CoinUnits.GP, 6);
        this.weight = 3.0;
    }
}
