package com.ludi.study.designpattern.factory.method.order;

import com.ludi.study.designpattern.factory.method.pizza.AbstractPizza;
import com.ludi.study.designpattern.factory.method.pizza.BeijingCheesePizza;
import com.ludi.study.designpattern.factory.method.pizza.BeijingPepperPizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:12
 */
public class BeijingOrderPizza extends AbstractOrderPizza{

    @Override
    AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BeijingCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }
}
