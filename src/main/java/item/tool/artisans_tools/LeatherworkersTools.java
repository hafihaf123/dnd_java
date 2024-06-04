package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class LeatherworkersTools extends Item implements ArtisansTools {
    public LeatherworkersTools() {
        this.name = "LeatherworkersTools";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = new Weight(WeightUnits.LB, 5.0);
    }
}
