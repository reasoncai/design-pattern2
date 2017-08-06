package com.cai.dp2.decorate;

/**
 * 装饰者抽象类: 调料
 * Created by reason on 17/8/6.
 */
public abstract class CondimentDecorator extends Beverage {
    //所有调料装饰者必须重新实现的方法
    public abstract String getDescription();
}
