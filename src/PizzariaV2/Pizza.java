package PizzariaV2;

import PizzariaV2.Ingredients.Cheese;
import PizzariaV2.Ingredients.Clam;
import PizzariaV2.Ingredients.Dough;
import PizzariaV2.Ingredients.Pepperoni;
import PizzariaV2.Ingredients.Sauce;
import PizzariaV2.Ingredients.Veggies;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public abstract class Pizza {

    private String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];
    public Cheese cheese;
    public Pepperoni pepperoni;
    public Clam clam;

    abstract public void prepare();

    void bake() {
        System.out.println("Assar por 25min a 350F");
    }

    void cut() {
        System.out.println("Cortar a pizza em fatias diagonais");
    }

    void box() {
        System.out.println("Colocar a pizza na caixa oficial da pizzaria");
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
