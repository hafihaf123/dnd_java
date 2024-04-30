package main.java.item;

import main.java.creature.character.properties.proficiency.Proficiency;
import main.java.item.coin.Coin;

public abstract class Item implements Proficiency {
    protected String name;
    protected Coin cost;
    /** in lb */
    protected int weight;
}