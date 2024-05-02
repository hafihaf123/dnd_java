package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.ArcaneFocus;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Staff extends Item implements ArcaneFocus {
    public Staff() {
        this.name = "Staff";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 4.0;
    }
}
