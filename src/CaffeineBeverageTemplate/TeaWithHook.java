package CaffeineBeverageTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    public TeaWithHook() {
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

    @Override
    public boolean customerWantsCondiments() {
        return getUserInput()
                .toLowerCase()
                .startsWith("s");
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Você deseja adicionar limao ao cha? (s|n)?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.out.println("IO Error trying read your answer.");
        }

        return answer;
    }
}
