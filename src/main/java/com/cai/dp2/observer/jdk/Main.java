package com.cai.dp2.observer.jdk;

import java.util.Observable;

/**
 * 用Jdk自身的观察者模式
 * Created by reason on 17/8/6.
 */
public class Main {
    public static void main(String[] args) {
        //创建主题
        WeatherData weatherData = new WeatherData();

        //订阅主题
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        //主题发生变化
        weatherData.setMeasurements(22, 33, 44);
        weatherData.setMeasurements(222, 333, 444);


    }

}
