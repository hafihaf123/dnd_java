package main.java.character_class;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CharacterClassFactory {
	private static final Map<String, Supplier<CharacterClass>> classMap = new HashMap<>();
	
	public CharacterClassFactory() {
		classMap.put("Barbarian", Barbarian::new);
		classMap.put("Bard", Bard::new);
		classMap.put("Cleric", Cleric::new);
	}
	
	public CharacterClass getClass(String className) throws IllegalArgumentException {
		Supplier<CharacterClass> characterClass = classMap.get(className);
		if (characterClass != null) {
			return characterClass.get();
		}
		throw new IllegalArgumentException(STR."Invalid class: \{className}");
	}

	public Map<String, Supplier<CharacterClass>> getClassMap() {
		return classMap;
	}
}
