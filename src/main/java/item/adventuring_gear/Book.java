package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;

public class Book extends Item {
    public Book() {
        this.name = "Book";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.weight = 5.0;
    }
}
