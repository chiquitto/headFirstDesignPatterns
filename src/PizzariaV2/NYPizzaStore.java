package PizzariaV2;

import PizzariaV2.Pizzas.CheesePizza;
import PizzariaV2.Pizzas.ClamPizza;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();
        
        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Pizza de Queijo no estilo NY");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Pizza de Mariscos no estilo NY");
                break;
        }
        
        return pizza;
    }

    
    
}
