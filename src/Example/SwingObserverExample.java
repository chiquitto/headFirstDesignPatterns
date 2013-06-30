package Example;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class SwingObserverExample {

    private JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame("Janela principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton button = new JButton("Posso fazer isso?");
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.pack();
        
        frame.setVisible(true);
    }

    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Não faça isso!");
        }
    }
    
    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Faça isso!");
        }
        
    }
}
