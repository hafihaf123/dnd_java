package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class ComponentPouch extends Item {
    public ComponentPouch() {
        this.name = "ComponentPouch";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 2.0;
    }
}
