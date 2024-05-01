package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.ReachWeapon;
import main.java.item.weapon.properties.SpecialWeapon;

public class Lance extends Weapon implements MartialWeapon, ReachWeapon, SpecialWeapon {
	public Lance() {
		this.name = "Lance";
		this.cost = new Coin(CoinType.GP, 10);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(12);
		this.weight = 6;
	}
}
