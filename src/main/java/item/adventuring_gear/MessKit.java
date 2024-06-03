package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class MessKit extends Item {
    public MessKit() {
        this.name = "MessKit";
        this.cost = new Coin(CoinUnits.SP, 2);
        this.weight = 1.0;
    }
}
