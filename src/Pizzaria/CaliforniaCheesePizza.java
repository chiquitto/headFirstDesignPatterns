package Pizzaria;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CaliforniaCheesePizza extends CheesePizza {
    public CaliforniaCheesePizza () {
        name = "Pizza com muito queijo e orégano estilo de California";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        
        toppings.add("Muçarela em pedaços");
    }

    @Override
    public void cut() {
        System.out.println("Cortar a pizza em pedaços grandes.");
    }
    
    
}
