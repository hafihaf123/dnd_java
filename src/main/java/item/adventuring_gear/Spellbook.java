package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Spellbook extends Item {
    public Spellbook() {
        this.name = "Spellbook";
        this.cost = new Coin(CoinType.GP, 50);
        this.weight = 3.0;
    }
}
