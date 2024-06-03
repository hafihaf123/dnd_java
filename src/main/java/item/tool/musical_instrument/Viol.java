package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Viol extends Item implements MusicalInstrument {
    public Viol() {
        this.name = "Viol";
        this.cost = new Coin(CoinUnits.GP, 30);
        this.weight = 1.0;
    }
}
