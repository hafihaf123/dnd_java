package main.java.item.weapon.ranged.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.*;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class HeavyCrossbow extends Weapon implements MartialWeapon, AmmunitionWeapon, HeavyWeapon, LoadingWeapon, TwoHandedWeapon {
	public HeavyCrossbow() {
		this.name = "Crossbow, heavy";
		this.cost = new Coin(CoinUnits.GP, 50);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(10);
		this.weight = new Weight(WeightUnits.LB, 18);
		this.normalRange = new Length(LengthUnits.FT, 100);
		this.maxRange = new Length(LengthUnits.FT, 400);
	}
}
