package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.HeavyWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;

public class Maul extends Weapon implements MartialWeapon, HeavyWeapon, TwoHandedWeapon {
	public Maul() {
		this.name = "Maul";
		this.cost = new Coin(CoinType.GP, 10);
		this.damageType = DamageType.BLUDGEONING;
		this.hitDice = new Dice(6);
		this.weight = 10;
		this.numOfRolls = 2;
	}
}
