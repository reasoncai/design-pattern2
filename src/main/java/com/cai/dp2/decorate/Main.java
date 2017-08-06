package com.cai.dp2.decorate;

/**
 * 装饰者模式:运行时赋予对象新的职责
 * Created by reason on 17/8/6.
 */
public class Main {
    public static void main(String[] args) {
        //一杯纯浓缩咖啡
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        //加奶
        espresso = new Milk(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        //再加摩卡
        espresso = new Mocha(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        //最后加奶泡
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription() + " $" + espresso.cost());


    }
}
