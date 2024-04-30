package main.java.creature.character.race;

import main.java.creature.properties.attributes.Attributes;
import main.java.creature.properties.language.Language;
import main.java.creature.properties.size.SizeCategory;

import java.util.*;

import static main.java.utils.ObjectsUtils.isExcluded;

public abstract class Race {
	protected String raceName;
	protected int ageMax;
	protected SizeCategory size;
	/** in feet */
	protected int speed;
	protected final Set<Language> languages = new HashSet<>();
	
	//ability score increase
	public abstract void applyRaceBonuses(Attributes attributes);
	
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
	
	public Set<Language> getLanguages() {
		return languages;
	}

    protected static <T extends Enum<T>> T chooseExtra(String prompt, Set<T> toExclude) {
		Scanner scanner = new Scanner(System.in);
		T extra;
		do {
			System.out.print(STR."\{prompt}: (cannot choose:");
			for (T t: toExclude)
				System.out.print(STR." \{t}");
			System.out.println(")");
			for (T t: EnumSet.allOf(toExclude.iterator().next().getDeclaringClass())) {
				System.out.println(t);
			}
			String input = scanner.nextLine();
			try {
				extra = Enum.valueOf(toExclude.iterator().next().getDeclaringClass(), input.toUpperCase());
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid language choice.");
				extra = chooseExtra(prompt, toExclude);
			}
		} while (!isExcluded(extra, toExclude));
		return extra;
	}
}