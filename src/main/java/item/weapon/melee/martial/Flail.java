package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;

public class Flail extends Weapon implements MartialWeapon {
	public Flail() {
		this.name = "Flail";
		this.cost = new Coin(CoinUnits.GP, 10);
		this.damageType = DamageType.BLUDGEONING;
		this.hitDice = new Dice(8);
		this.weight = 2;
	}
}
