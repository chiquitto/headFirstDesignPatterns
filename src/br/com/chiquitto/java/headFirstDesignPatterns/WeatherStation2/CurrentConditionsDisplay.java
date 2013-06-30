package br.com.chiquitto.java.headFirstDesignPatterns.WeatherStation2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public CurrentConditionsDisplay(Observable w) {
        this.weatherData = w;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData w = (WeatherData) o;
            
            this.temperature = w.getTemperature();
            this.humidity = w.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions:\n\t"
                + temperature + "F \n\t"
                + humidity + "% humidity");
    }
}
