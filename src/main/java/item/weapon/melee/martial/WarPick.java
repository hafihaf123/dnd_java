package main.java.item.weapon.melee.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;

public class WarPick extends Weapon implements MartialWeapon {
	public WarPick() {
		this.name = "War pick";
		this.cost = new Coin(CoinType.GP, 5);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(8);
		this.weight = 2;
	}
}
