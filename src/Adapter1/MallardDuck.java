package Adapter1;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

    @Override
    public void fly() {
        System.out.println("Estou voando");
    }
}
