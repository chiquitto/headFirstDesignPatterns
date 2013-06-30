
package br.com.chiquitto.java.headFirstDesignPatterns.WeatherStation2;

import java.util.Observable;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        
    }

    public void measurementsChanged() {
        setChanged();
        
        // Notifica os Observers de tras pra frente
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
    
    public float getTemperature() {
        return temperature;
    }
    
    public float getHumidity() {
        return humidity;
    }
    
    public float getPressure() {
        return pressure;
    }
}
