package main.java.item.weapon.ranged.martial;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.SpecialWeapon;
import main.java.item.weapon.properties.ThrownWeapon;

public class Net extends Weapon implements MartialWeapon, SpecialWeapon, ThrownWeapon {
	public Net() {
		this.name = "Net";
		this.cost = new Coin(CoinUnits.GP, 1);
		this.damageType = null;
		this.hitDice = null;
		this.weight = 3;
		this.normalRange = 5;
		this.maxRange = 15;
	}
}
