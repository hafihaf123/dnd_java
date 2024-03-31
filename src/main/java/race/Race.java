package main.java.race;

public abstract class Race {
	protected String raceName;
	
	//ability score increase
	protected int strengthBonus = 0;
	protected int dexterityBonus = 0;
	protected int constitutionBonus = 0;
	protected int intelligenceBonus = 0;
	protected int wisdomBonus = 0;
	protected int charismaBonus = 0;
	
	//the race's expected lifespan
	protected int ageMax;
	
	//size
	
	//speed in feet
	protected int speed;
	
	public String getRaceName() {
		return raceName;
	}
	
	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}
	
	public int getStrengthBonus() {
		return strengthBonus;
	}
	
	public void setStrengthBonus(int strengthBonus) {
		this.strengthBonus = strengthBonus;
	}
	
	public int getDexterityBonus() {
		return dexterityBonus;
	}
	
	public void setDexterityBonus(int dexterityBonus) {
		this.dexterityBonus = dexterityBonus;
	}
	
	public int getConstitutionBonus() {
		return constitutionBonus;
	}
	
	public void setConstitutionBonus(int constitutionBonus) {
		this.constitutionBonus = constitutionBonus;
	}
	
	public int getIntelligenceBonus() {
		return intelligenceBonus;
	}
	
	public void setIntelligenceBonus(int intelligenceBonus) {
		this.intelligenceBonus = intelligenceBonus;
	}
	
	public int getWisdomBonus() {
		return wisdomBonus;
	}
	
	public void setWisdomBonus(int wisdomBonus) {
		this.wisdomBonus = wisdomBonus;
	}
	
	public int getCharismaBonus() {
		return charismaBonus;
	}
	
	public void setCharismaBonus(int charismaBonus) {
		this.charismaBonus = charismaBonus;
	}
	
	public int getAgeMax() {
		return ageMax;
	}
	
	public void setAgeMax(int ageMax) {
		this.ageMax = ageMax;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}