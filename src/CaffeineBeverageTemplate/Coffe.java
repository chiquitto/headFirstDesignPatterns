package CaffeineBeverageTemplate;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Coffe extends CaffeineBeverage {

    public Coffe() {
        System.out.println("Preparar cafe");
    }
    
    @Override
    public void brew() {
        System.out.println("Misturar e coar o po");
    }

    @Override
    public void addCondiments() {
        System.out.println("Acrescentar acucar e leite");
    }
}
