package main.java.item.weapon.melee.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.ThrownWeapon;
import main.java.item.weapon.properties.VersatileWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Trident extends Weapon implements ThrownWeapon, VersatileWeapon {
	public Trident() {
		this.name = "Trident";
		this.cost = new Coin(CoinUnits.GP, 5);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(6);
		this.weight = new Weight(WeightUnits.LB, 4);
		this.normalRange = new Length(LengthUnits.FT, 20);
		this.maxRange = new Length(LengthUnits.FT, 60);
		this.twoHandedHitDice = new Dice(8);
	}
}
