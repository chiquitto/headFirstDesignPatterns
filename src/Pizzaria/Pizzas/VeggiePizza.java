package Pizzaria.Pizzas;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing VeggiePizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking VeggiePizza");
    }

    @Override
    public void cut() {
        System.out.println("Cuting VeggiePizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing VeggiePizza");
    }
    
}
