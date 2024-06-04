package main.java.item.weapon.melee.martial;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class WarPick extends Weapon implements MartialWeapon {
	public WarPick() {
		this.name = "War pick";
		this.cost = new Coin(CoinUnits.GP, 5);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(8);
		this.weight = new Weight(WeightUnits.LB, 2);
	}
}
