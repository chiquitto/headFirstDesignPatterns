package PizzariaV2;

import PizzariaV2.Ingredients.*;
import PizzariaV2.Ingredients.Cheeses.ReggianoCheese;
import PizzariaV2.Ingredients.Clams.FreshClam;
import PizzariaV2.Ingredients.Doughs.ThinCrustDough;
import PizzariaV2.Ingredients.Pepperonis.SlicedPepperoni;
import PizzariaV2.Ingredients.Sauces.MarinaraSauce;
import PizzariaV2.Ingredients.Veggieses.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies v[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return v;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
