package com.cai.dp2.observer.jdk;

import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * 观察者1：目前状况布告板
 * Created by reason on 17/8/6.
 */
public class CurrentConditionsDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /**
     * 主题状态变更，观察者响应事件
     *
     * @param o   订阅的主题
     * @param arg 主题传递的数据对象
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            //观察者自己拉数据
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();

            if (arg != null) {
                //接收主题推送的数据
                Map<String, Object> arg1 = (Map<String, Object>) arg;
                System.out.println("推送的数据: " + arg1.toString());
            }
        }
    }


    /**
     * 显示方法
     */
    public void display() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("拉的数据：Current conditions: ")
                .append(temperature)
                .append("F degrees and ")
                .append(humidity)
                .append("% humidity");
        System.out.println(stringBuffer.toString());
    }
}
