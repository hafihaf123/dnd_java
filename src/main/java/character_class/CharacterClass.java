package main.java.character_class;

public abstract class CharacterClass {
	protected String className;
	protected int hitDie;
	protected String[] primaryAbility;
	protected String[] savingThrowProficiencies;
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public int getHitDie() {
		return hitDie;
	}
	
	public void setHitDie(int hitDie) {
		this.hitDie = hitDie;
	}
	
	public String[] getPrimaryAbility() {
		return primaryAbility;
	}
	
	public void setPrimaryAbility(String[] primaryAbility) {
		this.primaryAbility = primaryAbility;
	}
	
	public String[] getSavingThrowProficiencies() {
		return savingThrowProficiencies;
	}
	
	public void setSavingThrowProficiencies(String[] savingThrowProficiencies) {
		this.savingThrowProficiencies = savingThrowProficiencies;
	}
}
