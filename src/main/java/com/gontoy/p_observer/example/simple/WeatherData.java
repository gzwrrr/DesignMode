package com.gontoy.p_observer.example.simple;

/**
 * @author gzw
 */
public class WeatherData {
    /**
     * 温度、气压、湿度
     */
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void dataChange() {
        // 调用接入者的更新方法
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    /**
     * 当数据更新时就调用此防范
     * @param temperature
     * @param pressure
     * @param humidity
     */
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        // 将最新消息推送给接入方
        dataChange();
    }
}
