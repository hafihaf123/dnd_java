package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Book extends Item {
    public Book() {
        this.name = "Book";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = new Weight(WeightUnits.LB, 5.0);
    }
}
