package main.java.attributes;

import java.util.EnumMap;
import java.util.Map;

public class Attributes {
	private final Map<Attribute, Integer> attributes;
	
	public Attributes() {
		attributes = new EnumMap<>(Attribute.class);
		for (Attribute attribute : Attribute.values()) {
			attributes.put(attribute, 10);
		}
	}
	
	public int getAttribute(Attribute attribute) {
		return attributes.get(attribute);
	}
	
	public void setAttribute(Attribute attribute, int value) {
		attributes.put(attribute, value);
	}
}