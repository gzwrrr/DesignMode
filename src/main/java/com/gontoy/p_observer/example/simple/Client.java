package com.gontoy.p_observer.example.simple;

/**
 * 没有使用观察者模式的实现
 * @author gzw
 */
public class Client {

    public static void main(String[] args) {
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData = new WeatherData(currentConditions);
        weatherData.setData(10, 20, 30);
    }
}
