package main.java.item.weapon.ranged.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.LoadingWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.item.weapon.properties.TwoHandedWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class LightCrossbow extends Weapon implements SimpleWeapon, AmmunitionWeapon, LoadingWeapon, TwoHandedWeapon {
    public LightCrossbow() {
        this.name = "Crossbow, light";
        this.cost = new Coin(CoinUnits.GP, 25);
        this.damageType = DamageType.PIERCING;
        this.hitDice = new Dice(8);
        this.weight = new Weight(WeightUnits.LB, 5);
        this.normalRange = new Length(LengthUnits.FT, 80);
        this.maxRange = new Length(LengthUnits.FT, 320);
    }
}
