package Pizzaria;

import java.util.ArrayList;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    ArrayList<Object> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparando " + getName());
        System.out.println("Amassando a massa ...");
        System.out.println("Adicionando molho ...");

        System.out.println("Adicionando as coberturas ...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    ;
    public void bake() {
        System.out.println("Assar por 35 minutos a 350F");
    }

    ;
    public void cut() {
        System.out.println("Cortando a pizza em pedaços diagonais");
    }

    ;
    public void box() {
        System.out.println("Colocar a pizza na caixa oficial da PizzaStore");
    }

    ;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
}
