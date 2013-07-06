package Pizzaria.Pizzas;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparing " + getClass().getSimpleName());
    }

    @Override
    public void bake() {
        System.out.println("Baking " + getClass().getSimpleName());
    }

    @Override
    public void cut() {
        System.out.println("Cuting " + getClass().getSimpleName());
    }

    @Override
    public void box() {
        System.out.println("Boxing " + getClass().getSimpleName());
    }
    
}
