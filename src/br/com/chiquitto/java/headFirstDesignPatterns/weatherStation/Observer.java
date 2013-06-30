package br.com.chiquitto.java.headFirstDesignPatterns.weatherStation;

/**
 *
 * @author Alisson Chiquitto <chiquitto@gmail.com>
 */
public interface Observer {

    public void update(float temperature, float humidity, float pressure);
}
