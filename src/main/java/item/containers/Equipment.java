package main.java.item.containers;

import main.java.item.armor.Armor;
import main.java.item.armor.light_armor.NoArmor;
import main.java.item.armor.shield.Shield;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.melee.simple.UnarmedStrike;
import main.java.item.weapon.properties.TwoHandedWeapon;
import main.java.item.weapon.properties.VersatileWeapon;

import java.util.Objects;

public class Equipment {
	private Weapon weapon;
	private Armor armor;
	private Weapon secondWeapon;
	private Shield shield;
	
	public Equipment() {
		this.weapon = new UnarmedStrike();
		this.armor = new NoArmor();
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void equipWeapon(Weapon weapon) {
		if (!hasWeaponEquipped())
			this.weapon = weapon;
	}

	@SuppressWarnings("BooleanMethodIsAlwaysInverted")
    public boolean hasWeaponEquipped() {
        return this.weapon != null && !(this.weapon instanceof UnarmedStrike);
    }

	public boolean hasWeaponEquipped(Weapon weapon) {
		return Objects.equals(this.weapon.getClass(), weapon.getClass());
	}
	
	public Armor getArmor() {
		return armor;
	}
	
	public void equipArmor(Armor armor) {
		if (!hasArmorEquipped())
			this.armor = armor;
	}

	public boolean hasArmorEquipped() {
		return this.armor != null && !(this.armor instanceof NoArmor);
	}

	public boolean hasArmorEquipped(Armor armor) {
		return Objects.equals(this.armor.getClass(), armor.getClass());
	}
	
	public Weapon getSecondWeapon() {
		return secondWeapon;
	}
	
	public void equipSecondWeapon(Weapon secondWeapon) throws IllegalArgumentException {
		if (!hasWeaponEquipped())
			this.weapon = secondWeapon;
		if (!(this.weapon instanceof TwoHandedWeapon || this.weapon instanceof VersatileWeapon))
			throw new IllegalArgumentException("You cannot equip a second weapon");
		if (!(secondWeapon instanceof TwoHandedWeapon || secondWeapon instanceof VersatileWeapon))
			throw new IllegalArgumentException("You cannot equip this weapon as a second weapon. It must have either the two-handed or the versatile property.");
		if (!hasSecondWeaponEquipped())
			this.secondWeapon = secondWeapon;
	}

	public boolean hasSecondWeaponEquipped() {
		return this.secondWeapon != null;
	}

	public boolean hasSecondWeaponEquipped(Weapon secondWeapon) {
		return Objects.equals(this.secondWeapon.getClass(), secondWeapon.getClass());
	}

	public Shield getShield() {
		return shield;
	}

	public void equipShield(Shield shield) {
		if (!hasShieldEquipped())
			this.shield = shield;
	}

	public boolean hasShieldEquipped() {
		return this.shield != null;
	}
}
