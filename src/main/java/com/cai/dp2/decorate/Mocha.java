package com.cai.dp2.decorate;

/**
 * 装饰者类：调料摩卡
 * Created by reason on 17/8/6.
 */
public class Mocha extends CondimentDecorator {
    //用一个实例变量记录组件（被装饰者）饮料
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        //返回原被装饰者的描述+现在新加的调料
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        //返回原来被装饰者的价钱+新加调料的价钱
        return beverage.cost() + 0.2;
    }
}
