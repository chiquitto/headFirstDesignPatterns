package StrategyGameWeapon.Char;

import StrategyGameWeapon.Weapon.WeaponBehavior;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
abstract public class Person {
    
    protected WeaponBehavior weapon;
    
    public Person(WeaponBehavior weapon) {
        this.setWeapon(weapon);
    }

    abstract public void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
