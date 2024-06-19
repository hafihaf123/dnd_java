package main.java.creature.character;

import main.java.creature.character.properties.proficiency.Proficiencies;
import main.java.creature.properties.alignment.Alignment;
import main.java.creature.properties.attributes.Attribute;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.character.character_class.CharacterClass;
import main.java.creature.Creature;
import main.java.creature.character.race.Race;
import main.java.item.container.Equipment;

public class Character extends Creature {
	private Race race;
	private int age;
	private CharacterClass characterClass;
	private final Proficiencies proficiencies;
	private final Equipment equipment;

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
		this.maxHP = characterClass.getHitDice().getSides() + attributes.getModifier(Attribute.CON);
		this.currentHP = this.maxHP;
		this.alignment = builder.alignment;
		this.proficiencies = new Proficiencies();
		this.equipment = new Equipment();
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

    public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public Proficiencies getProficiencies() {
		return proficiencies;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	@Override
	public int getArmorClass() {
		int AC_fromArmor = equipment.getArmor().getArmorClass(attributes.getModifier(Attribute.DEX));
		if (equipment.hasShieldEquipped())
			return AC_fromArmor + 2;
		return AC_fromArmor;
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
					proficiencies = '\{proficiencies}',
					characterClass = '\{characterClass.getClassName()}',
					current HP = '\{currentHP}',
					max HP = '\{maxHP}',
					alignment = '\{alignment}',
					strength = '\{attributes.getAttribute(Attribute.STR)}',
					dexterity = '\{attributes.getAttribute(Attribute.DEX)}',
					constitution = '\{attributes.getAttribute(Attribute.CON)}',
					intelligence = '\{attributes.getAttribute(Attribute.INT)}',
					wisdom = '\{attributes.getAttribute(Attribute.WIS)}',
					charisma = '\{attributes.getAttribute(Attribute.CHA)}'
				}
				""";
//					armor class = '\{armorClass}',
	}
}