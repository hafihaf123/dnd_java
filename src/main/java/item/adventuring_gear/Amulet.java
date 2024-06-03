package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.HolySymbol;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Amulet extends Item implements HolySymbol {
    public Amulet() {
        this.name = "Amulet";
        this.cost = new Coin(CoinUnits.GP, 5);
        this.weight = 1.0;
    }
}
