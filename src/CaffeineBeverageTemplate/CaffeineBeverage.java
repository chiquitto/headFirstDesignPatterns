package CaffeineBeverageTemplate;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public abstract class CaffeineBeverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        poirInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Ferver agua");
    }

    public void poirInCup() {
        System.out.println("Despejar no copo");
    }
}
