package PizzariaV2;

import PizzariaV2.Ingredients.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
