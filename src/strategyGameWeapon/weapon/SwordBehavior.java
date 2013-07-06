package strategyGameWeapon.weapon;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Usar arma: Espada");
    }
}
