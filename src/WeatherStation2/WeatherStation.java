package WeatherStation2;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public class WeatherStation {

    public WeatherStation() {
        WeatherData w = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(w);
        HeatIndexDisplay heatDisplay = new HeatIndexDisplay(w);
        ForecastDisplay forecastDisplay = new ForecastDisplay(w);
        
        w.setMeasurements(80, 65, 30.4f);
        w.setMeasurements(82, 70, 29.2f);
        w.setMeasurements(78, 90, 29.2f);
    }
}
