package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.HolySymbol;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Reliquary extends Item implements HolySymbol {
    public Reliquary() {
        this.name = "Reliquary";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
