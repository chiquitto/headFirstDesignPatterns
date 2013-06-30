/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StarbuzzCoffe.Beverages;

import StarbuzzCoffe.Beverage;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Expresso extends Beverage {
    public Expresso() {
        description = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
