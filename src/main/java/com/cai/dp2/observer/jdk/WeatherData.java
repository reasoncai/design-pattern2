package com.cai.dp2.observer.jdk;

import java.util.HashMap;
import java.util.Observable;

/**
 * 天气主题，
 * Created by reason on 17/8/6.
 */
public class WeatherData extends Observable {
    //天气状态值
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {

    }

    /**
     * 天气状态值变化，观察者拉数据
     */
    public void measurementsChanged() {
        //将标志位置为已发生了变化
        setChanged();
        //通知观察者，观察者拉数据
        notifyObservers();
    }

    /**
     * 天气值变化，主题主动推数据
     */
    public void measurementsChangedAndPush() {
        setChanged();
        HashMap<String, Object> map = new HashMap<>();
        map.put("temperature", this.temperature);
        map.put("humidity", this.humidity);
        map.put("pressure", this.pressure);
        notifyObservers(map);
    }

    /**
     * 天气状态值
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        //拉模式
        this.measurementsChanged();
        //推模式
        this.measurementsChangedAndPush();
    }


    /**
     * 使用观察者"拉"的做法，所以要暴露状态属性
     *
     * @return
     */
    public float getTemperature() {
        return this.temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
