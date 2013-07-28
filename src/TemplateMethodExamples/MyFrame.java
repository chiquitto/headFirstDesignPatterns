package TemplateMethodExamples;

import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * Estamos criando uma extensao de JFrame que contem um metodo update() para
 * controlar o algoritmo que atualiza a tela. O metodo update() é o Template
 * Method, podemos controlar o update() com o uso do metodo gancho paint().
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class MyFrame extends JFrame {

    public MyFrame(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }

    /**
     *
     * O algoritmo de atualizacao da tela de JFrame chama paint(). Por default,
     * paint() nao faz nada, é apenas um hook, estamos substituindo paint() e
     * determinando ao JFrame que desenhe uma mensagem na tela.
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Eu mando!!", 200, 100);
    }

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame("Use a Cabeca: Padroes de projeto");
    }
}
