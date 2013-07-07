package PizzariaV2.Pizzas;

import PizzariaV2.Pizza;
import PizzariaV2.PizzaIngredientFactory;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    
    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparando " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
