package main.java.character_class;

public class Barbarian extends CharacterClass {
	public Barbarian() {
		this.className = "Barbarian";
		this.hitDie = 12;
		this.primaryAbility = new String[] {"Strength"};
		this.savingThrowProficiencies = new String[] {"Strength", "Constitution"};
	}
}
