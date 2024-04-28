package main.java.race;

import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.size.SizeCategory;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

import static main.java.utils.ObjectsUtils.isExcluded;

public abstract class Race {
	protected String raceName;
	protected int ageMax;
	protected SizeCategory size;
	//speed in feet
	protected int speed;
	protected final List<Language> languages = new ArrayList<>();
	
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
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public SizeCategory getSize() {
		return size;
	}
	
	public void addLanguage(Language language) {
		this.languages.add(language);
	}
	
	public List<Language> getLanguages() {
		return languages;
	}

    @SafeVarargs
	protected static <T extends Enum<T>> T chooseExtra(String prompt, T... toExclude) {
		return chooseExtra(prompt, List.of(toExclude));
	}

    protected static <T extends Enum<T>> T chooseExtra(String prompt, List<T> toExclude) {
		Scanner scanner = new Scanner(System.in);
		T extra;
		do {
			System.out.println(prompt);
			for (T t : EnumSet.allOf(toExclude.getFirst().getDeclaringClass())) {
				System.out.println(t);
			}
			String input = scanner.nextLine().toUpperCase();
			try {
				extra = Enum.valueOf(toExclude.getFirst().getDeclaringClass(), input);
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid language choice.");
				extra = chooseExtra(prompt, toExclude);
			}
		} while (!isExcluded(extra, toExclude));
		return extra;
	}
}