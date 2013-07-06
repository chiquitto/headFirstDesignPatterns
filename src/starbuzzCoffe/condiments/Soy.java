package starbuzzCoffe.condiments;

import starbuzzCoffe.Beverage;
import starbuzzCoffe.CondimentDecorator;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class Soy extends CondimentDecorator {
    
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
    
}
