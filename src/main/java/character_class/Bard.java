package main.java.character_class;

import main.java.attributes.Attribute;

public class Bard extends CharacterClass {
	public Bard() {
		this.className = "Bard";
		this.hitDie = 8;
		this.primaryAbility = new Attribute[] {Attribute.CHA};
		this.savingThrowProficiencies = new Attribute[] {Attribute.DEX, Attribute.CHA};
	}
}
