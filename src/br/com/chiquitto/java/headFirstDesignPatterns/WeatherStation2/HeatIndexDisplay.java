package br.com.chiquitto.java.headFirstDesignPatterns.WeatherStation2;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class HeatIndexDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;

    public HeatIndexDisplay(Observable w) {
        this.weatherData = w;
        this.weatherData.addObserver(this);
    }

    /**
     * @link http://www.headfirstlabs.com/books/hfdp/heatindex.txt
     */
    private float computeHeatIndex(float t, float rh) {
        float index = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh))
                + (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583
                * (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh))
                + (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh))
                + 0.000000000843296 * (t * t * rh * rh * rh))
                - (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
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
        System.out.println("Heat Index:\n\t"
                + computeHeatIndex(this.temperature, this.humidity));
    }
}
