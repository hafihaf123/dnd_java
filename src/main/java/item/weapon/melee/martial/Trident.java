package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.ThrownWeapon;
import main.java.item.weapon.properties.VersatileWeapon;

public class Trident extends Weapon implements ThrownWeapon, VersatileWeapon {
	public Trident() {
		this.name = "Trident";
		this.cost = new Coin(CoinType.GP, 5);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(6);
		this.weight = 4;
		this.normalRange = 20;
		this.maxRange = 60;
		this.twoHandedHitDice = new Dice(8);
	}
}
