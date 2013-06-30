package weatherStation;

import weatherStation.Observer;
import weatherStation.Subject;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject w) {
        this.weatherData = w;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:\n\t"
                + temperature + "F \n\t"
                + humidity + "% humidity");
    }
}
