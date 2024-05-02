package main.java.item.tool;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class NavigatorsTools extends Item {
    public NavigatorsTools() {
        this.name = "NavigatorsTools";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 2.0;
    }
}