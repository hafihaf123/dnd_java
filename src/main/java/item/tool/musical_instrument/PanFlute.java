package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class PanFlute extends Item implements MusicalInstrument {
    public PanFlute() {
        this.name = "PanFlute";
        this.cost = new Coin(CoinUnits.GP, 12);
        this.weight = 2.0;
    }
}
