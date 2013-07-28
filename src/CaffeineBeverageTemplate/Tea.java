package CaffeineBeverageTemplate;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Tea extends CaffeineBeverage {

    public Tea() {
        System.out.println("Preparar cha");
    }

    @Override
    public void brew() {
        System.out.println("Mergulhar saquinho de cha na agua");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adicionar limao");
    }
}
