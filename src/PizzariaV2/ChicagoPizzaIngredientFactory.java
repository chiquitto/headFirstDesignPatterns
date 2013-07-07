package PizzariaV2;

import PizzariaV2.Ingredients.*;
import PizzariaV2.Ingredients.Cheeses.MozzarellaCheese;
import PizzariaV2.Ingredients.Clams.FrozenClam;
import PizzariaV2.Ingredients.Doughs.ThinCrustDough;
import PizzariaV2.Ingredients.Pepperonis.SlicedPepperoni;
import PizzariaV2.Ingredients.Sauces.PlumTomatoSauce;
import PizzariaV2.Ingredients.Veggieses.*;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies v[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return v;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
