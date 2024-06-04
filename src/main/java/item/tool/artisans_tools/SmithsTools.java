package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class SmithsTools extends Item implements ArtisansTools {
    public SmithsTools() {
        this.name = "SmithsTools";
        this.cost = new Coin(CoinUnits.GP, 20);
        this.weight = new Weight(WeightUnits.LB, 8.0);
    }
}
