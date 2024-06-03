package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Lyre extends Item implements MusicalInstrument {
    public Lyre() {
        this.name = "Lyre";
        this.cost = new Coin(CoinUnits.GP, 30);
        this.weight = 2.0;
    }
}
