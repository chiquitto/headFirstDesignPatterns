package Pizzaria;

import Pizzaria.Pizzas.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        
        if (item.equals("cheese")) {
            pizza = new NYCheesePizza();
        }
        else if (item.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }

        return pizza;
    }
}
