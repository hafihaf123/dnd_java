package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.HeavyWeapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;

public class Greataxe extends Weapon implements MartialWeapon, HeavyWeapon, TwoHandedWeapon {
	public Greataxe() {
		this.name = "Greataxe";
		this.cost = new Coin(CoinType.GP, 30);
		this.damageType = DamageType.SLASHING;
		this.hitDice = new Dice(12);
		this.weight = 7;
	}
}