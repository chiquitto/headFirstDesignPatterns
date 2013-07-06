package Pizzaria.Pizzas;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing CheesePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking CheesePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting CheesePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing CheesePizza");
    }
    
}
