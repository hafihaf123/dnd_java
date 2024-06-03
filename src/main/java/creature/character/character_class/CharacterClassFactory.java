package main.java.creature.character.character_class;

import main.java.creature.character.character_class.subclasses.*;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CharacterClassFactory {
	private final Map<String, Supplier<CharacterClass>> classMap = new HashMap<>();
	
	public CharacterClassFactory() {
		addClass(new Barbarian());
		addClass(new Bard());
		addClass(new Cleric());
		addClass(new Druid());
		addClass(new Fighter());
		addClass(new Monk());
		addClass(new Paladin());
		addClass(new Ranger());
		addClass(new Rogue());
		addClass(new Sorcerer());
		addClass(new Warlock());
	}

	public void addClass(CharacterClass characterClass) {
		this.classMap.put(characterClass.getClassName().toLowerCase(), () -> characterClass);
	}
	
	public CharacterClass getClass(String className) throws IllegalArgumentException {
		Supplier<CharacterClass> characterClass = classMap.get(className.toLowerCase());
		if (characterClass != null) {
			return characterClass.get();
		}
		throw new IllegalArgumentException(STR."Invalid class: \{className}");
	}

	public Map<String, Supplier<CharacterClass>> getClassMap() {
		return classMap;
	}
}
