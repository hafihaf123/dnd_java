package main.java.item.weapon.ranged.martial;
import main.java.item.coin.Coin;
import main.java.item.coin.CoinType;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.MartialWeapon;
import main.java.item.weapon.properties.SpecialWeapon;
import main.java.item.weapon.properties.ThrownWeapon;

public class Net extends Weapon implements MartialWeapon, SpecialWeapon, ThrownWeapon {
	public Net() {
		this.name = "Net";
		this.cost = new Coin(CoinType.GP, 1);
		this.damageType = null;
		this.hitDice = null;
		this.weight = 3;
		this.normalRange = 5;
		this.maxRange = 15;
	}
}
