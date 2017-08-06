package com.cai.dp2.observer.custom;

/**
 * 自定义实现观察者模式
 * 主题接口
 * Created by reason on 17/8/6.
 */
public interface Subject {
    /**
     * 订阅
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 取消订阅
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
