package Adapter1;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class PatoTest {
    public static void main(String[] args) {
        MallardPato pato = new MallardPato();
        
        WildPavao pavao = new WildPavao();
        Pato pavaoAdapter = new PavaoAdapter(pavao);
        
        System.out.println("O Pavao diz ...");
        pavao.gobble();
        pavao.fly();
        
        System.out.println("\nO Pato diz ...");
        pato.quack();
        pato.fly();
        
        System.out.println("\nO PavaoAdapter diz ...");
        pavaoAdapter.quack();
        pavaoAdapter.fly();
    }
}
