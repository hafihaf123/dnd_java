package main.java.item.weapon.ranged.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.LoadingWeapon;
import main.java.item.weapon.properties.MartialWeapon;

public class Blowgun extends Weapon implements MartialWeapon, AmmunitionWeapon, LoadingWeapon {
	public Blowgun() {
		this.name = "Blowgun";
		this.cost = new Coin(CoinUnits.GP, 10);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(1);
		this.weight = 1;
		this.normalRange = 25;
		this.maxRange = 100;
	}
}
