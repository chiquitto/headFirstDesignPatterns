package strategyGameWeapon.weapon;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Usar arma: Arco e flecha");
    }
}
