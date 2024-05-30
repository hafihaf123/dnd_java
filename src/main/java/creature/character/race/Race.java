package main.java.creature.character.race;

import main.java.creature.character.properties.proficiency.Proficiencies;
import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.properties.size.SizeCategory;
import main.java.damage.DamageType;

import java.util.*;

public abstract class Race {
	protected String raceName;
	protected int ageMax;
	protected SizeCategory size;
	/** in feet */
	protected int speed;
	protected final Set<Language> languages = new HashSet<>();
	protected final Proficiencies proficiencies = new Proficiencies();
	protected final Set<DamageType> resistances = new HashSet<>();

	//ability score increase
	public abstract void applyRaceBonuses(Attributes attributes);

	public void createFromInput() {}
	
	public Race() {
		addLanguage(Language.COMMON);
	}
	
	public String getRaceName() {
		return raceName;
	}
	
	public int getAgeMax() {
		return ageMax;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public SizeCategory getSize() {
		return size;
	}
	
	public void addLanguage(Language language) {
		this.languages.add(language);
	}

	public void removeLanguage(Language language) {
		this.languages.remove(language);
	}
	
	public Set<Language> getLanguages() {
		return languages;
	}

	public void addResistance(DamageType damageType) {
		this.resistances.add(damageType);
	}

	public void removeResistance(DamageType damageType) {
		this.resistances.remove(damageType);
	}

	public Set<DamageType> getResistances() {
		return resistances;
	}
}