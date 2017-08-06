package com.cai.dp2.observer.custom;

/**
 * 观察者接口
 * Created by reason on 17/8/6.
 */
public interface Observer {
    //观察者收到通知后，响应事件的方法
    void update(float temp, float humidity, float pressure);
}
