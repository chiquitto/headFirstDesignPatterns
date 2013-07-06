package Pizzaria;

import Pizzaria.Pizzas.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class PizzariaTest {
    public static void main(String[] args) {
        PizzaStore pizzaria = new PizzaStore(new SimplePizzaFactory());
        
        Pizza cheesePizza = pizzaria.orderPizza("cheese");
        Pizza veggiePizza = pizzaria.orderPizza("veggie");
    }
}
