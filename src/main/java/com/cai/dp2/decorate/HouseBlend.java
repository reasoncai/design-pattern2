package com.cai.dp2.decorate;

/**
 * 组件类（被装饰）：综合咖啡
 * Created by reason on 17/8/6.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
