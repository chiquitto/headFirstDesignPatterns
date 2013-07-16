package Adapter1;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class DuckTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("O Pavao diz ...");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("\nO Pato diz ...");
        duck.quack();
        duck.fly();
        
        System.out.println("\nO PavaoAdapter diz ...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
