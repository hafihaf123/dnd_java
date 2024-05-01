package main.java.item.weapon.ranged.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.HeavyWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;

public class Longbow extends Weapon implements MartialWeapon, AmmunitionWeapon, HeavyWeapon, TwoHandedWeapon {
	public Longbow() {
		this.name = "Longbow";
		this.cost = new Coin(CoinType.GP, 50);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(8);
		this.weight = 2;
		this.normalRange = 150;
		this.maxRange = 600;
	}
}
