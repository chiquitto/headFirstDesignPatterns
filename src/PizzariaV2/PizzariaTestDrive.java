package PizzariaV2;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class PizzariaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        
        Pizza pizza;
        
        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan pediu uma " + pizza.getName() + "\n");
    }
}
