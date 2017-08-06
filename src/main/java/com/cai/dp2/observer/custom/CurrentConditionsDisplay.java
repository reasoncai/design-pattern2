package com.cai.dp2.observer.custom;

/**
 * 观察者1：目前状况布告板
 * Created by reason on 17/8/6.
 */
public class CurrentConditionsDisplay implements Observer {
    //天气状态值
    private float temperature;
    private float humidity;
    private float pressure;

    //订阅的主题
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        //订阅主题
        weatherData.registerObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        this.display();
    }

    /**
     * 显示方法
     */
    public void display(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Current conditions: ")
                .append(temperature)
                .append("F degrees and ")
                .append(humidity)
                .append("% humidity");
        System.out.println(stringBuffer.toString());
    }
}
