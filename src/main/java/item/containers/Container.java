package main.java.item.containers;

import main.java.item.Item;

import java.util.ArrayList;
import java.util.List;

public abstract class Container {
	private final List<Item> items;
	
	public Container() {
		this.items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public boolean hasItem(Item item) {
		return items.contains(item);
	}
	
	public List<Item> getItems() {
		return items;
	}
}
