package StrategyGameWeapon.Weapon;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class KnifeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Usar arma: Faca");
    }
}
