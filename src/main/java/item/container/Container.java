package main.java.item.container;

import main.java.item.Item;
import main.java.units.weight.Weight;

import java.util.ArrayList;
import java.util.List;

public abstract class Container extends Item {
	private final List<Item> items;
	protected Weight capacity;
	private Weight currentWeight;
	
	public Container() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) throws IllegalArgumentException {
		addWeight(item.getWeight());
        items.add(item);
	}

	public void removeItem(Item item) throws IllegalArgumentException {
		if (!hasItem(item))
			throw new IllegalArgumentException(STR."Cannot remove '\{item.getName()}' from '\{this.getName()}'. '\{this.getName()}' does not contain '\{item.getName()}'");
		if (items.remove(item))
			removeWeight(item.getWeight());
	}
	
	public boolean hasItem(Item item) {
		return items.contains(item);
	}
	
	public List<Item> getItems() {
		return items;
	}

	private void addWeight(Weight weight) throws IllegalArgumentException {
		if (currentWeight.getBaseAmount() + weight.getBaseAmount() > capacity.getBaseAmount())
			throw new IllegalArgumentException("Added weight exceeds container capacity");
		currentWeight.addAmount(weight);
	}

	private void removeWeight(Weight weight) throws IllegalArgumentException {
		if (currentWeight.getBaseAmount() - weight.getBaseAmount() < 0)
			throw new IllegalArgumentException("Weight cannot be negative after removal");
		currentWeight.addBaseAmount(0 - weight.getBaseAmount());
	}
}