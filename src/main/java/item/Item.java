package main.java.item;

import main.java.creature.character.properties.proficiency.Proficiency;
import main.java.units.coin.Coin;
import main.java.units.weight.Weight;

public abstract class Item implements Proficiency {
    protected String name;
    protected Coin cost;
    protected Weight weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coin getCost() {
        return cost;
    }

    public void setCost(Coin cost) {
        this.cost = cost;
    }

    public Weight getWeight() {
        return weight;
    }

    public void setWeight(Weight weight) {
        this.weight = weight;
    }
}
