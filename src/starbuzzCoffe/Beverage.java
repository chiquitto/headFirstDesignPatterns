package starbuzzCoffe;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}
