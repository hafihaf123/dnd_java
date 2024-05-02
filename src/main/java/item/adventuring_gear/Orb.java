package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Orb extends Item implements ArcaneFocus {
    public Orb() {
        this.name = "Orb";
        this.cost = new Coin(CoinType.GP, 20);
        this.weight = 3.0;
    }
}
