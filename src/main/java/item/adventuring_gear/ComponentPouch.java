package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class ComponentPouch extends Item {
    public ComponentPouch() {
        this.name = "ComponentPouch";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 2.0;
    }
}
