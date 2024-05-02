package main.java.item.tool.artisans_tools;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class WoodcarversTools extends Item implements ArtisansTools {
    public WoodcarversTools() {
        this.name = "WoodcarversTools";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 5.0;
    }
}
