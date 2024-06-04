package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class PanFlute extends Item implements MusicalInstrument {
    public PanFlute() {
        this.name = "PanFlute";
        this.cost = new Coin(CoinUnits.GP, 12);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
