package com.cai.dp2.observer.custom;

import java.util.ArrayList;

/**
 * 天气主题
 * Created by reason on 17/8/6.
 */
public class WeatherData implements Subject {
    //订阅该主题的观察者列表
    private ArrayList observers;

    //要通知的天气状态值
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        //找出观察者在列表中的位置
        int i = observers.indexOf(o);
        if (i >= 0) {
            //移除观察者
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        //循环观察者列表，通知观察者
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            //观察者响应事件
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 天气状态值变化，通知观察者
     */
    public void measurementsChanged(){
        this.notifyObservers();
    }

    /**
     * 设置天气状态值
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
