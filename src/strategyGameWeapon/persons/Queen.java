package strategyGameWeapon.persons;

import strategyGameWeapon.weapon.WeaponBehavior;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Queen extends Person {
    
    public Queen(WeaponBehavior w) {
        super(w);
    }

    @Override
    public void fight() {
        System.out.println("Queen: Lutar");
        this.weapon.useWeapon();
    }
}
