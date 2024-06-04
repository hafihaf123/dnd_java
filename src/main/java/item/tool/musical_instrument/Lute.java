package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Lute extends Item implements MusicalInstrument {
    public Lute() {
        this.name = "Lute";
        this.cost = new Coin(CoinUnits.GP, 35);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
