package main.java.item.weapon.ranged.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.HeavyWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Longbow extends Weapon implements MartialWeapon, AmmunitionWeapon, HeavyWeapon, TwoHandedWeapon {
	public Longbow() {
		this.name = "Longbow";
		this.cost = new Coin(CoinUnits.GP, 50);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(8);
		this.weight = new Weight(WeightUnits.LB, 2);
		this.normalRange = new Length(LengthUnits.FT, 150);
		this.maxRange = new Length(LengthUnits.FT, 600);
	}
}
