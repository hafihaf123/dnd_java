package main.java.character_class;

public class Cleric extends CharacterClass {
	public Cleric() {
		this.className = "Cleric";
		this.hitDie = 8;
		this.primaryAbility = new String[] {"Wisdom"};
		this.savingThrowProficiencies = new String[] {"Wisdom", "Charisma"};
	}
}
