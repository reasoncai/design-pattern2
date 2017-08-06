package com.cai.dp2.decorate;

/**
 * 饮料类（组件和装饰者的共同基类）
 * Created by reason on 17/8/6.
 */
public abstract class Beverage {
    String description = "Unknow Beverage";

    public String getDescription() {
        return this.description;
    }

    /**
     * 计算价格
     *
     * @return
     */
    public abstract double cost();
}
