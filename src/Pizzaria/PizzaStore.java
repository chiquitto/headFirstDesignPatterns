package Pizzaria;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
abstract public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract public Pizza createPizza(String item);
}
