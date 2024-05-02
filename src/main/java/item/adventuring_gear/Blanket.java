package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Blanket extends Item {
    public Blanket() {
        this.name = "Blanket";
        this.cost = new Coin(CoinType.SP, 5);
        this.weight = 3.0;
    }
}
