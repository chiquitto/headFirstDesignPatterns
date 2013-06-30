package StrategyGameWeapon.Char;

import StrategyGameWeapon.Weapon.WeaponBehavior;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Troll extends Person {
    
    public Troll(WeaponBehavior w) {
        super(w);
    }

    @Override
    public void fight() {
        System.out.println("Queen: Lutar");
        this.weapon.useWeapon();
    }
}
