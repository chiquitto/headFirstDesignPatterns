/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WeatherStation2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private Observable weatherData;

    public ForecastDisplay(Observable w) {
        this.weatherData = w;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData w = (WeatherData) o;
            
            lastPressure = currentPressure;
            currentPressure = w.getPressure();
            
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current pressure:\n\t"
                + currentPressure);
    }
}
