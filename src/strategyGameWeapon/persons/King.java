package strategyGameWeapon.persons;

import strategyGameWeapon.weapon.WeaponBehavior;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class King extends Person {
    
    public King(WeaponBehavior w) {
        super(w);
    }

    @Override
    public void fight() {
        System.out.println("King: Lutar");
        this.weapon.useWeapon();
    }
}
