package Pizzaria;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class ChicagoCheesePizza extends CheesePizza {
    public ChicagoCheesePizza () {
        name = "Pizza de Queijo em prato fundo no estilo de Chicago";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        
        toppings.add("Muçarela fatiada");
    }

    @Override
    public void cut() {
        System.out.println("Cortar a pizza em pedaços quadrados.");
    }
    
    
}
