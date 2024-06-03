package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Bagpipes extends Item implements MusicalInstrument {
    public Bagpipes() {
        this.name = "Bagpipes";
        this.cost = new Coin(CoinUnits.GP, 30);
        this.weight = 6.0;
    }
}
