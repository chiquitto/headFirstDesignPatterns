package CaffeineBeverageTemplate;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CaffeineBeverageTest {

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        
        Coffe coffe = new Coffe();
        coffe.prepareRecipe();
    }
}