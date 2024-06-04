package main.java.item.weapon.melee.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.VersatileWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Longsword extends Weapon implements MartialWeapon, VersatileWeapon {
	public Longsword() {
		this.name = "Longsword";
		this.cost = new Coin(CoinUnits.GP, 15);
		this.damageType = DamageType.SLASHING;
		this.hitDice = new Dice(8);
		this.weight = new Weight(WeightUnits.LB, 3);
		this.twoHandedHitDice = new Dice(10);
	}
}
