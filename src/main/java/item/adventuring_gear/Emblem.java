package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.HolySymbol;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Emblem extends Item implements HolySymbol {
    public Emblem() {
        this.name = "Emblem";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 0.0;
    }
}
