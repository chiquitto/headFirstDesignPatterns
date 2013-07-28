package TemplateMethodExamples;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class MyApplet extends Applet {

    String message;

    /**
     * O gancho init permite que fazer qualquer coisa para inicializar o applet
     * da primeira vez.
     */
    @Override
    public void init() {
        message = "Ola mundo, estou vivo!";
        repaint();
    }

    /**
     * Gancho start(), permite que o applet faca algo assim que ele esta prestes
     * a ser exibido.
     */
    @Override
    public void start() {
        message = "Agora estou comecando";
        repaint();
    }

    /**
     * Quando o usuario segue para outra pagina, o gancho stop() é utilizado e o
     * applet pode fazer tudo o que quiser para encerrar as suas acoes.
     */
    @Override
    public void stop() {
        message = "Agora estao me parando";
        repaint();
    }

    /**
     * Gancho destroy.
     */
    @Override
    public void destroy() {
        super.destroy(); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * Gancho paint.
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.drawString(message, 5, 15);
    }
}
