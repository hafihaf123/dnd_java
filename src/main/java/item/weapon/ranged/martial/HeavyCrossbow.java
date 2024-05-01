package main.java.item.weapon.ranged.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.*;

public class HeavyCrossbow extends Weapon implements MartialWeapon, AmmunitionWeapon, HeavyWeapon, LoadingWeapon, TwoHandedWeapon {
	public HeavyCrossbow() {
		this.name = "Crossbow, heavy";
		this.cost = new Coin(CoinType.GP, 50);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(10);
		this.weight = 18;
		this.normalRange = 100;
		this.maxRange = 400;
	}
}
