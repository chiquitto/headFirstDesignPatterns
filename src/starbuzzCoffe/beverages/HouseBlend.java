package starbuzzCoffe.beverages;

import starbuzzCoffe.Beverage;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
