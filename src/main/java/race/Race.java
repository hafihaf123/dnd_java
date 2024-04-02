package main.java.race;

import main.java.attributes.Attribute;
import main.java.attributes.Attributes;
import main.java.language.Language;
import main.java.size.SizeCategory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static main.java.utils.ObjectsUtils.isExcluded;

public abstract class Race {
	protected String raceName;
	protected int ageMax;
	protected SizeCategory size;
	//speed in feet
	protected int speed;
	protected List<Language> languages = new ArrayList<>();
	
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
	
	protected static Attribute chooseExtraAttribute(String prompt, Attribute... exclude) {
		Scanner scanner = new Scanner(System.in);
		Attribute extraAttribute;
		do {
			System.out.println(prompt);
			for (Attribute attribute : Attribute.values()) {
				System.out.println(attribute);
			}
			String input = scanner.nextLine().toUpperCase();
			try {
				extraAttribute = Attribute.valueOf(input);
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid attribute choice.");
				extraAttribute = chooseExtraAttribute(prompt);
			}
		} while (!isExcluded(extraAttribute, exclude));
		return extraAttribute;
	}
	
	protected static Language chooseExtraLanguage(String prompt, List<Language> languages) {
		Scanner scanner = new Scanner(System.in);
		Language extraLanguage;
		do {
			System.out.println(prompt);
			for (Language language : Language.values()) {
				System.out.println(language);
			}
			String input = scanner.nextLine().toUpperCase();
			try {
				extraLanguage = Language.valueOf(input);
			} catch (IllegalArgumentException e) {
				System.out.println("Invalid language choice.");
				extraLanguage = chooseExtraLanguage(prompt, languages);
			}
		} while (!isExcluded(extraLanguage, languages));
		return extraLanguage;
	}
}