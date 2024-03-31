package main.java.character;

import main.java.race.Race;

public class Character {
	//attributes
	private String name;
	private Race race;
	private String characterClass;
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	public static class Builder {
		private final String name;
		private Race race;
		private String characterClass;
		private int strength;
		private int dexterity;
		private int constitution;
		private int intelligence;
		private int wisdom;
		private int charisma;
		
		public Builder(String name) {
			this.name = name;
		}
		
		public Builder race(Race race) {
			this.race = race;
			return this;
		}
		
		public Builder characterClass(String characterClass) {
			this.characterClass = characterClass;
			return this;
		}
		
		public Builder strength(int strength) {
			this.strength = strength;
			return this;
		}
		
		public Builder dexterity(int dexterity) {
			this.dexterity = dexterity;
			return this;
		}
		
		public Builder constitution(int constitution) {
			this.constitution = constitution;
			return this;
		}
		
		public Builder intelligence(int intelligence) {
			this.intelligence = intelligence;
			return this;
		}
		
		public Builder wisdom(int wisdom) {
			this.wisdom = wisdom;
			return this;
		}
		
		public Builder charisma(int charisma) {
			this.charisma = charisma;
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
		this.strength = builder.strength;
		this.dexterity = builder.dexterity;
		this.constitution = builder.constitution;
		this.intelligence = builder.intelligence;
		this.wisdom = builder.wisdom;
		this.charisma = builder.charisma;
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
	
	public String getCharacterClass() {
		return characterClass;
	}
	
	public void setCharacterClass(String characterClass) {
		this.characterClass = characterClass;
	}
	
	public int getStrength() {
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getDexterity() {
		return dexterity;
	}
	
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	
	public int getConstitution() {
		return constitution;
	}
	
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	
	public int getIntelligence() {
		return intelligence;
	}
	
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getWisdom() {
		return wisdom;
	}
	
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	
	public int getCharisma() {
		return charisma;
	}
	
	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}
	
	@Override
	public String toString() {
		return STR
				. """
				Character {
					name = '\{name}',
					race = '\{race.getRaceName()}',
					characterClass = '\{characterClass}',
					strength = '\{strength}',
					dexterity = '\{dexterity}',
					constitution = '\{constitution}',
					intelligence = '\{intelligence}',
					wisdom = '\{wisdom}',
					charisma = '\{charisma}'
				}
				""" ;
	}
}