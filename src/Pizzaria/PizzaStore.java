package Pizzaria;

import Pizzaria.Pizzas.Pizza;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class PizzaStore {

    private SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.pizzaFactory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        try {
            pizza = pizzaFactory.factory(type);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }

        return pizza;
    }
}
