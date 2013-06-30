package StrategyGameWeapon.Char;

import StrategyGameWeapon.Weapon.WeaponBehavior;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Knight extends Person {
    
    public Knight(WeaponBehavior w) {
        super(w);
    }

    @Override
    public void fight() {
        System.out.println("Knight: Lutar");
        this.weapon.useWeapon();
    }
}
