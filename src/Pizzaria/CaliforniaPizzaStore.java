/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizzaria;

import Pizzaria.Pizzas.CaliforniaCheesePizza;
import Pizzaria.Pizzas.Pizza;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CaliforniaPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        
        if (item.equals("cheese")) {
            pizza = new CaliforniaCheesePizza();
        }

        return pizza;
    }
    
}
