package main.java.item.weapon.melee.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.FinesseWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Rapier extends Weapon implements MartialWeapon, FinesseWeapon {
	public Rapier() {
		this.name = "Rapier";
		this.cost = new Coin(CoinUnits.GP, 25);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(8);
		this.weight = new Weight(WeightUnits.LB, 2);
	}
}
