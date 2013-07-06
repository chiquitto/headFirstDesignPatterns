package strategyGameWeapon;

import strategyGameWeapon.persons.King;
import strategyGameWeapon.persons.Person;
import strategyGameWeapon.weapon.AxeBehavior;

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
