package main.java.item.containers;

import main.java.item.armor.Armor;
import main.java.item.armor.light_armor.NoArmor;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.melee.simple.UnarmedStrike;
import main.java.item.weapon.properties.TwoHandedWeapon;
import main.java.item.weapon.properties.VersatileWeapon;

public class Equipment {
	private Weapon weapon;
	private Armor armor;
	private Weapon secondWeapon;
	
	public Equipment() {
		this.weapon = new UnarmedStrike();
		this.armor = new NoArmor();
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void equipWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public Armor getArmor() {
		return armor;
	}
	
	public void equipArmor(Armor armor) {
		this.armor = armor;
	}
	
	public Weapon getSecondWeapon() {
		return secondWeapon;
	}
	
	public void equipSecondWeapon(Weapon secondWeapon) throws IllegalArgumentException {
		if (this.weapon == null)
			this.weapon = secondWeapon;
		if (!(this.weapon instanceof TwoHandedWeapon || this.weapon instanceof VersatileWeapon))
			throw new IllegalArgumentException("You cannot equip a second weapon");
		if (!(secondWeapon instanceof TwoHandedWeapon || secondWeapon instanceof VersatileWeapon))
			throw new IllegalArgumentException("You cannot equip this weapon as a second weapon. It must have either the two-handed or the versatile property.");
		this.secondWeapon = secondWeapon;
	}
}
