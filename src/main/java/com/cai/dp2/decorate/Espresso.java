package com.cai.dp2.decorate;

/**
 * 组件类（被装饰）：浓缩咖啡
 * Created by reason on 17/8/6.
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
