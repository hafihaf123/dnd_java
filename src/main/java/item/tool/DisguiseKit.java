package main.java.item.tool;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class DisguiseKit extends Item {
    public DisguiseKit() {
        this.name = "DisguiseKit";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 3.0;
    }
}
