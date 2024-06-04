package main.java.item;

import main.java.creature.character.properties.proficiency.Proficiency;
import main.java.units.coin.Coin;
import main.java.units.weight.Weight;

public abstract class Item implements Proficiency {
    protected String name;
    protected Coin cost;
    protected Weight weight;
}
