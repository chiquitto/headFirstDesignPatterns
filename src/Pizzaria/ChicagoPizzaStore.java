package Pizzaria;

import Pizzaria.Pizzas.ChicagoVeggiePizza;
import Pizzaria.Pizzas.ChicagoCheesePizza;
import Pizzaria.Pizzas.Pizza;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        
        if (item.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }
        else if (item.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }

        return pizza;
    }
}
