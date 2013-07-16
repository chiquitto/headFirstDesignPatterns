package Adapter1;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class PavaoAdapter implements Pato {

    Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void quack() {
        pavao.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            pavao.fly();
        }
    }
}
