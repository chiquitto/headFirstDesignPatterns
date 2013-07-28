package CaffeineBeverageTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CoffeWithHook extends CaffeineBeverageWithHook {

    public CoffeWithHook() {
        System.out.println("Preparar cafe");
    }

    @Override
    public void brew() {
        System.out.println("Misturar e coar o po");
    }

    @Override
    public void addCondiments() {
        System.out.println("Acrescentar acucar e leite");
    }

    @Override
    public boolean customerWantsCondiments() {
        return getUserInput()
                .toLowerCase()
                .startsWith("s");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Você deseja acucar e leite no seu café (s|n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO Error trying read your answer.");
        }

        return answer;
    }
}
