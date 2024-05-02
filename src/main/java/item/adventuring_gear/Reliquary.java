package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.HolySymbol;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Reliquary extends Item implements HolySymbol {
    public Reliquary() {
        this.name = "Reliquary";
        this.cost = new Coin(CoinType.GP, 5);
        this.weight = 2.0;
    }
}
