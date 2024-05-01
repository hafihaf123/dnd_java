package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.HeavyWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.ReachWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;

public class Pike extends Weapon implements MartialWeapon, HeavyWeapon, ReachWeapon, TwoHandedWeapon {
	public Pike() {
		this.name = "Pike";
		this.cost = new Coin(CoinType.GP, 5);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(10);
		this.weight = 18;
	}
}
