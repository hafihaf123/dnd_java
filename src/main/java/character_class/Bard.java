package main.java.character_class;

public class Bard extends CharacterClass {
	public Bard() {
		this.className = "Bard";
		this.hitDie = 8;
		this.primaryAbility = new String[] {"Charisma"};
		this.savingThrowProficiencies = new String[] {"Dexterity", "Charisma"};
	}
}
