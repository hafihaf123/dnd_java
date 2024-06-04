package main.java.item.tool.gaming_set;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class PlayingCardSet extends Item implements GamingSet {
    public PlayingCardSet() {
        this.name = "PlayingCardSet";
        this.cost = new Coin(CoinUnits.SP, 5);
        this.weight = new Weight(WeightUnits.LB, 0.0);
    }
}
