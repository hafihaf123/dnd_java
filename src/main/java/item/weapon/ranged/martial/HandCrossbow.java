package main.java.item.weapon.ranged.martial;
import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.LightWeapon;
import main.java.item.weapon.properties.LoadingWeapon;
import main.java.item.weapon.properties.MartialWeapon;

public class HandCrossbow extends Weapon implements MartialWeapon, AmmunitionWeapon, LightWeapon, LoadingWeapon {
	public HandCrossbow() {
		this.name = "Crossbow, hand";
		this.cost = new Coin(CoinType.GP, 75);
		this.damageType = DamageType.PIERCING;
		this.hitDice = new Dice(6);
		this.weight = 3;
		this.normalRange = 30;
		this.maxRange = 120;
	}
}