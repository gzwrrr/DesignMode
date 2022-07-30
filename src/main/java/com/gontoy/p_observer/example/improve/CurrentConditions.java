package com.gontoy.p_observer.example.improve;

/**
 * @author gzw
 */
public class CurrentConditions implements Observer {
    /**
     * 温度、气压、湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;

    /**
     * 更新天气情况
     * 由 WeatherData 调用，即推送模式
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    /**
     * 显示
     */
    private void display() {
        System.out.printf("=============== temperature: %f ===============\n", temperature);
        System.out.printf("=============== pressure: %f ===============\n", pressure);
        System.out.printf("=============== humidity: %f ===============\n", humidity);
    }
}
