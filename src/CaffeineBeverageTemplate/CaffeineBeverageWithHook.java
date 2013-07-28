package CaffeineBeverageTemplate;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public abstract class CaffeineBeverageWithHook {

    public final void prepareRecipe() {
        boilWater();
        brew();
        poirInCup();
        
        if (customerWantsCondiments()) {
            addCondiments();
        }
        
        System.out.println("Bebida servida\n");
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Ferver agua");
    }

    public void poirInCup() {
        System.out.println("Despejar no copo");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}
