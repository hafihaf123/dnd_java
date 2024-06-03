package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.FinesseWeapon;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.MartialWeapon;

public class Shortsword extends Weapon implements MartialWeapon, FinesseWeapon, LightWeapon {
	public Shortsword() {
		this.name = "Shortsword";
		this.cost = new Coin(CoinUnits.GP, 10);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(6);
		this.weight = 2;
	}
}
