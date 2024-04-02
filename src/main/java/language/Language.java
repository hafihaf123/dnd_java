package main.java.language;

public enum Language {
	// Standard languages
	COMMON(LanguageType.STANDARD),
	DWARVISH(LanguageType.STANDARD),
	ELVISH(LanguageType.STANDARD),
	GIANT(LanguageType.STANDARD),
	GNOMISH(LanguageType.STANDARD),
	GOBLIN(LanguageType.STANDARD),
	HALFLING(LanguageType.STANDARD),
	ORC(LanguageType.STANDARD),
	
	// Exotic languages
	ABYSSAL(LanguageType.EXOTIC),
	CELESTIAL(LanguageType.EXOTIC),
	DRACONIC(LanguageType.EXOTIC),
	DEEP_SPEECH(LanguageType.EXOTIC),
	INFERNAL(LanguageType.EXOTIC),
	PRIMORDIAL(LanguageType.EXOTIC),
	SYLVAN(LanguageType.EXOTIC),
	UNDERCOMMON(LanguageType.EXOTIC);
	
	private final LanguageType type;
	
	Language(LanguageType type) {
		this.type = type;
	}
	
	public LanguageType getType() {
		return type;
	}
}
