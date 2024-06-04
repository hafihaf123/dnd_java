package main.java.item.tool;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class NavigatorsTools extends Item {
    public NavigatorsTools() {
        this.name = "NavigatorsTools";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = new Weight(WeightUnits.LB, 2.0);
    }
}
