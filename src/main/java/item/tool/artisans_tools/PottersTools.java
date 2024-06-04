package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class PottersTools extends Item implements ArtisansTools {
    public PottersTools() {
        this.name = "PottersTools";
        this.cost = new Coin(CoinUnits.GP, 10);
        this.weight = new Weight(WeightUnits.LB, 3.0);
    }
}
