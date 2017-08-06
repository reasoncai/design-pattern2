package com.cai.dp2.observer.custom;

/**
 * 自定义实现观察者模式
 * Created by reason on 17/8/6.
 */
public class Main {
    public static void main(String[] args) {
        //创建主题
        WeatherData weatherData = new WeatherData();

        //观察者订阅主题
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        new StatisticsDisplay(weatherData);

        //主题发生变化，观察者收到事件通知
        weatherData.setMeasurements(100,90,80);

    }
}
