package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.VersatileWeapon;

public class Battleaxe extends Weapon implements MartialWeapon, VersatileWeapon {
	public Battleaxe() {
		this.name = "Battleaxe";
		this.cost = new Coin(CoinType.GP, 10);
		this.damageType = DamageType.SLASHING;
		this.hitDice = new Dice(8);
		this.weight = 4;
		this.twoHandedHitDice = new Dice(10);
	}
}
