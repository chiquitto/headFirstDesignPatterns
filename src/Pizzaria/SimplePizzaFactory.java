package Pizzaria;

import Pizzaria.Pizzas.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class SimplePizzaFactory {
    public Pizza factory(String type) throws Exception {
        Pizza pizza;
        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new Exception("Pizza não existe no menu");
        }
        return pizza;
    }
}
