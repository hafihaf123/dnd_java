package main.java.item.weapon.melee.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.HeavyWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Greatsword extends Weapon implements MartialWeapon, HeavyWeapon, TwoHandedWeapon {
	public Greatsword() {
		this.name = "Greatsword";
		this.cost = new Coin(CoinUnits.GP, 50);
		this.damageType = DamageType.SLASHING;
		this.hitDice = new Dice(6);
		this.weight = new Weight(WeightUnits.LB, 6);
		this.numOfRolls = 2;
	}
}
