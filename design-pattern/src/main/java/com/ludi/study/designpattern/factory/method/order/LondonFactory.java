package com.ludi.study.designpattern.factory.method.order;

import com.ludi.study.designpattern.factory.method.pizza.AbstractPizza;
import com.ludi.study.designpattern.factory.method.pizza.LondonCheesePizza;
import com.ludi.study.designpattern.factory.method.pizza.LondonPepperPizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:45
 */
public class LondonFactory implements AbstractFactory {
    @Override
    public AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LondonCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }
}
