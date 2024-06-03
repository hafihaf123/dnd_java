package main.java.item.tool;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class NavigatorsTools extends Item {
    public NavigatorsTools() {
        this.name = "NavigatorsTools";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 2.0;
    }
}
