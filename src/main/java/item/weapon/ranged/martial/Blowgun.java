package main.java.item.weapon.ranged.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.LoadingWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Blowgun extends Weapon implements MartialWeapon, AmmunitionWeapon, LoadingWeapon {
	public Blowgun() {
		this.name = "Blowgun";
		this.cost = new Coin(CoinUnits.GP, 10);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(1);
		this.weight = new Weight(WeightUnits.LB, 1);
		this.normalRange = new Length(LengthUnits.FT, 25);
		this.maxRange = new Length(LengthUnits.FT, 100);
	}
}
