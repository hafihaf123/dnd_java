package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Lyre extends Item implements MusicalInstrument {
    public Lyre() {
        this.name = "Lyre";
        this.cost = new Coin(CoinUnits.GP, 30);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
