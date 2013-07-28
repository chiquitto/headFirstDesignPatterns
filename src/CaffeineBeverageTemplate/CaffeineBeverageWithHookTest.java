package CaffeineBeverageTemplate;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CaffeineBeverageWithHookTest {

    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();
        
        CoffeWithHook coffeWithHook = new CoffeWithHook();
        coffeWithHook.prepareRecipe();
    }
}