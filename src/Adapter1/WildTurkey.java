package Adapter1;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("Estou voando por curto espaço");
    }
}
