package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.FinesseWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.ReachWeapon;

public class Whip extends Weapon implements MartialWeapon, FinesseWeapon, ReachWeapon {
	public Whip() {
		this.name = "Whip";
		this.cost = new Coin(CoinUnits.GP, 2);
		this.damageType = DamageType.SLASHING;
		this.hitDice = new Dice(4);
		this.weight = 3;
	}
}
