package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Blanket extends Item {
    public Blanket() {
        this.name = "Blanket";
        this.cost = new Coin(CoinUnits.SP, 5);
        this.weight = 3.0;
    }
}
