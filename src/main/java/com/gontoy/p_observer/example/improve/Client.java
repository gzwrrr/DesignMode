package com.gontoy.p_observer.example.improve;

/**
 * @author gzw
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        weatherData.registerObserver(new CurrentConditions());
        weatherData.registerObserver(new OtherObserver());

        weatherData.setData(10, 20, 30);
    }
}
