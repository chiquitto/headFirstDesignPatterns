/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class InputTest {

    public static void main(String[] args) {

        JFileChooser x = new JFileChooser();
        x.setFileSelectionMode(JFileChooser.FILES_ONLY);
        x.showOpenDialog(null);

        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                    new FileInputStream(x.getSelectedFile().getPath())));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
