package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.adventuring_gear.properties.AmmunitionAdventuringGear;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Arrows extends Item implements AmmunitionAdventuringGear {
    public Arrows() {
        this.name = "Arrows";
        this.cost = new Coin(CoinType.GP, 1);
        this.weight = 1.0;
    }
}
