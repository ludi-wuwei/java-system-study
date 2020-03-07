package com.ludi.study.designpattern.factory.order;

import com.ludi.study.designpattern.factory.pizza.AbstractPizza;
import com.ludi.study.designpattern.factory.pizza.CheesePizza;
import com.ludi.study.designpattern.factory.pizza.GreekPizza;
import com.ludi.study.designpattern.factory.pizza.PepperPizza;

/**
 * @author 陆迪
 * @date 2020/3/7 23:43
 * 简单工厂类
 */
public class SimpleFactory {

    public AbstractPizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        AbstractPizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }

    public static AbstractPizza createPizza2(String orderType) {
        System.out.println("使用简单工厂模式");
        AbstractPizza pizza = null;
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if ("cheese".equals(orderType)) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if ("pepper".equals(orderType)) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;
    }
}
