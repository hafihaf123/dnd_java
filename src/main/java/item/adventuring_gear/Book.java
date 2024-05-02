package main.java.item.adventuring_gear;

import main.java.item.Item;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;

public class Book extends Item {
    public Book() {
        this.name = "Book";
        this.cost = new Coin(CoinType.GP, 25);
        this.weight = 5.0;
    }
}
