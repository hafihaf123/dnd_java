package main.java.item.tool.musical_instrument;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Dulcimer extends Item implements MusicalInstrument {
    public Dulcimer() {
        this.name = "Dulcimer";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = new Weight(WeightUnits.LB, 10.0);
    }
}
