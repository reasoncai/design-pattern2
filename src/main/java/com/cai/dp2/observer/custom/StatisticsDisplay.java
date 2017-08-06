package com.cai.dp2.observer.custom;

/**
 * 观察者2：统计布告板
 * Created by reason on 17/8/6.
 */
public class StatisticsDisplay implements Observer {
    private float sum;

    public StatisticsDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        //统计
        this.sum = temp+humidity+pressure;
        display();
    }

    public void display(){
        System.out.println("sum: "+sum);
    }
}
