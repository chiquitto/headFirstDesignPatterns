package Pizzaria;

import Pizzaria.Pizzas.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class PizzariaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        PizzaStore californiaStore = new CaliforniaPizzaStore();
        
        Pizza pizza;
        
        pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan pediu uma " + pizza.getName() + "\n");
        
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel pediu uma " + pizza.getName() + "\n");
        
        pizza = californiaStore.orderPizza("cheese");
        System.out.println("Chiquitto pediu uma " + pizza.getName() + "\n");
    }
}
