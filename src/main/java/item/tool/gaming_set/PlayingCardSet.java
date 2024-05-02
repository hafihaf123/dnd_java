package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class PlayingCardSet extends Item implements GamingSet {
    public PlayingCardSet() {
        this.name = "PlayingCardSet";
        this.cost = new Coin(CoinType.SP, 5);
        this.weight = 0.0;
    }
}
