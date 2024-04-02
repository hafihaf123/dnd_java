package main.java.character;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.character_class.CharacterClass;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

import java.util.List;

public class Character {
	private String name;
	private Race race;
	private int age;
	private SizeCategory size;
	/** speed in feet */
	private int speed;
	private final List<Language> languages;
	private CharacterClass characterClass;
	private Attributes attributes;
	
	public static class Builder {
		private final String name;
		private Race race;
		private CharacterClass characterClass;
		private Attributes attributes;
		private int age;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder race(Race race) {
			this.race = race;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
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
		this.size = race.getSize();
		this.speed = race.getSpeed();
		this.age = builder.age;
		this.languages = race.getLanguages();
		this.characterClass = builder.characterClass;
		this.attributes = builder.attributes;
		race.applyRaceBonuses(attributes);
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
	
	public SizeCategory getSize() {
		return size;
	}
	
	public void setSize(SizeCategory size) {
		this.size = size;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Language> getLanguages() {
		return languages;
	}
	
	public void addLanguage(Language language) {
		languages.add(language);
	}
	
	@Override
	public String toString() {
		return STR
				. """
				Character {
					name = '\{name}',
					race = '\{race.getRaceName()}',
					age = '\{age}',
					size = '\{size}',
					speed = '\{speed}',
					languages = '\{languages}',
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