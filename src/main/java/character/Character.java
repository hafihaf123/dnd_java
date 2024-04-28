package main.java.character;

import main.java.alignment.Alignment;
import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.character_class.CharacterClass;
import main.java.creature.Creature;
import main.java.language.Language;
import main.java.race.Race;
import main.java.size.SizeCategory;

import java.util.List;

public class Character extends Creature {
	private Race race;
	private int age;
	private CharacterClass characterClass;

    public static class Builder {
		private final String name;
		private Race race;
		private int age;
		private CharacterClass characterClass;
		private Attributes attributes;
		private Alignment alignment;
		
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
		
		public Builder alignment(Alignment alignment) {
			this.alignment = alignment;
			return this;
		}
		
		public Character build() {
			return new Character(this);
		}
	}
	
	public Character(Builder builder) {
		this.name = builder.name;
//		this.armorClass =
		this.race = builder.race;
		this.size = race.getSize();
		this.speed = race.getSpeed();
		this.age = builder.age;
		this.languages = race.getLanguages();
		this.characterClass = builder.characterClass;
		this.attributes = builder.attributes;
		race.applyRaceBonuses(attributes);
		this.hp = characterClass.getHitDie() + attributes.getModifier(Attribute.CON);
		this.alignment = builder.alignment;
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
	
	public Alignment getAlignment() {
		return alignment;
	}
	
	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}
	
	@Override
	public String toString() {
		return STR.
				"""
				Character {
					name = '\{name}',
					race = '\{race.getRaceName()}',
					size = '\{size}',
					speed = '\{speed}',
                    age = '\{age}',
					languages = '\{languages}',
					characterClass = '\{characterClass.getClassName()}',
					hp = '\{hp}',
					alignment = '\{alignment}',
					strength = '\{attributes.getAttribute(Attribute.STR)}',
					dexterity = '\{attributes.getAttribute(Attribute.DEX)}',
					constitution = '\{attributes.getAttribute(Attribute.CON)}',
					intelligence = '\{attributes.getAttribute(Attribute.INT)}',
					wisdom = '\{attributes.getAttribute(Attribute.WIS)}',
					charisma = '\{attributes.getAttribute(Attribute.CHA)}'
				}
				""";
	}
}