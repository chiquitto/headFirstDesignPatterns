package Adapter1;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey pavao) {
        this.turkey = pavao;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
