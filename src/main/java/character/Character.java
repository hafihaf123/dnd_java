package main.java.character;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.character_class.CharacterClass;
import main.java.race.Race;

public class Character {
	private String name;
	private Race race;
	private CharacterClass characterClass;
	
	//attributes
	private Attributes attributes;
	
	public static class Builder {
		private final String name;
		private Race race;
		private CharacterClass characterClass;
		private Attributes attributes;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder race(Race race) {
			this.race = race;
			return this;
		}
		
		public Builder characterClass(CharacterClass characterClass) {
			this.characterClass = characterClass;
			return this;
		}
		
		public Builder attributes(Attributes attributes) {
			this.attributes = attributes;
			return this;
		}
		
		public Character build() {
			return new Character(this);
		}
	}
	
	public Character(Builder builder) {
		this.name = builder.name;
		this.race = builder.race;
		this.characterClass = builder.characterClass;
		this.attributes = builder.attributes;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Race getRace() {
		return race;
	}
	
	public void setRace(Race race) {
		this.race = race;
	}
	
	public CharacterClass getCharacterClass() {
		return characterClass;
	}
	
	public void setCharacterClass(CharacterClass characterClass) {
		this.characterClass = characterClass;
	}
	
	public Attributes getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	
	@Override
	public String toString() {
		return STR
				. """
				Character {
					name = '\{name}',
					race = '\{race.getRaceName()}',
					characterClass = '\{characterClass.getClassName()}',
					strength = '\{attributes.getAttribute(Attribute.STRENGTH)}',
					dexterity = '\{attributes.getAttribute(Attribute.DEXTERITY)}',
					constitution = '\{attributes.getAttribute(Attribute.CONSTITUTION)}',
					intelligence = '\{attributes.getAttribute(Attribute.INTELLIGENCE)}',
					wisdom = '\{attributes.getAttribute(Attribute.WISDOM)}',
					charisma = '\{attributes.getAttribute(Attribute.CHARISMA)}'
				}
				""" ;
	}
}