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

public class Glaive extends Weapon implements MartialWeapon, HeavyWeapon, ReachWeapon, TwoHandedWeapon {
	public Glaive() {
		this.name = "Glaive";
		this.cost = new Coin(CoinType.GP, 20);
		this.damageType = DamageType.SLASHING;
		this.hitDice = new Dice(10);
		this.weight = 6;
	}
}
