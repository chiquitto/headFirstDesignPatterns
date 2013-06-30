package StrategyGameWeapon;

import StrategyGameWeapon.Char.King;
import StrategyGameWeapon.Char.Person;
import StrategyGameWeapon.Weapon.AxeBehavior;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class GameWeapon {

    public GameWeapon() {
        Person c = new King(new AxeBehavior());
        c.fight();
    }
}
