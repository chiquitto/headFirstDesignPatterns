package starbuzzCoffe.beverages;

import starbuzzCoffe.Beverage;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
