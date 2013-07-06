package Pizzaria;

import Pizzaria.Pizzas.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class PizzariaTest {
    public static void main(String[] args) {
        PizzaStore nyPizzaria = new NYPizzaStore();
        Pizza nyCheesePizza = nyPizzaria.orderPizza("cheese");
        Pizza nyVeggiePizza = nyPizzaria.orderPizza("veggie");
        
        PizzaStore chicagoPizzaria = new ChicagoPizzaStore();
        Pizza chicagoCheesePizza = chicagoPizzaria.orderPizza("cheese");
        Pizza chicagoVeggiePizza = chicagoPizzaria.orderPizza("veggie");
    }
}
