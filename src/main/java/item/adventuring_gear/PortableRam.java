package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class PortableRam extends Item {
    public PortableRam() {
        this.name = "PortableRam";
        this.cost = new Coin(CoinUnits.GP, 4);
        this.weight = 35.0;
    }
}
