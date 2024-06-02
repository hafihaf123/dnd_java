package main.java.creature.properties.attributes;

import java.util.EnumMap;
import java.util.Map;

public class Attributes {
	private final Map<Attribute, Integer> attributes;
	
	public Attributes() {
		attributes = new EnumMap<>(Attribute.class);
		for (Attribute attribute: Attribute.values()) {
			attributes.put(attribute, 10);
		}
	}

	public Attributes(int str, int dex, int con, int intelligence, int wis, int cha) {
		attributes = new EnumMap<>(Attribute.class);
		for (Attribute attribute: Attribute.values()) {
			attributes.put(attribute, 10);
		}
		setAttribute(Attribute.STR, str);
		setAttribute(Attribute.DEX, dex);
		setAttribute(Attribute.CON, con);
		setAttribute(Attribute.INT, intelligence);
		setAttribute(Attribute.WIS, wis);
		setAttribute(Attribute.CHA, cha);
	}

	public int getModifier(Attribute attribute) {
		return (attributes.get(attribute) - 10)/2;
	}
	
	public int getAttribute(Attribute attribute) {
		return attributes.get(attribute);
	}
	
	public void setAttribute(Attribute attribute, int value) {
		attributes.put(attribute, value);
	}
	
	public void applyBonus(Attribute attribute, int bonus) {
		int currentValue = getAttribute(attribute);
		setAttribute(attribute, currentValue + bonus);
	}
}