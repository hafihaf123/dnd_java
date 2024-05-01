package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.VersatileWeapon;

public class Warhammer extends Weapon implements MartialWeapon, VersatileWeapon {
	public Warhammer() {
		this.name = "Warhammer";
		this.cost = new Coin(CoinType.GP, 15);
		this.damageType = DamageType.BLUDGEONING;
		this.hitDice = new Dice(8);
		this.weight = 2;
		this.twoHandedHitDice = new Dice(10);
	}
}
