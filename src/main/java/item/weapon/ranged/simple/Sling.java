package main.java.item.weapon.ranged.simple;

import main.java.damage.DamageType;
import main.java.dice.Dice;
import main.java.item.weapon.Weapon;
import main.java.item.weapon.properties.AmmunitionWeapon;
import main.java.item.weapon.properties.SimpleWeapon;
import main.java.units.coin.Coin;
import main.java.units.coin.CoinUnits;
import main.java.units.length.Length;
import main.java.units.length.LengthUnits;
import main.java.units.weight.Weight;
import main.java.units.weight.WeightUnits;

public class Sling extends Weapon implements SimpleWeapon, AmmunitionWeapon {
    public Sling() {
        this.name = "Sling";
        this.cost = new Coin(CoinUnits.SP, 1);
        this.damageType = DamageType.BLUDGEONING;
        this.hitDice = new Dice(4);
        this.weight = new Weight(WeightUnits.LB, 0);
        this.normalRange = new Length(LengthUnits.FT, 30);
        this.maxRange = new Length(LengthUnits.FT, 120);
    }
}
