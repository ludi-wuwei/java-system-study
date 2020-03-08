package com.ludi.study.designpattern.factory.method.order;

import com.ludi.study.designpattern.factory.method.pizza.*;

/**
 * @author 陆迪
 * @date 2020/3/8 12:12
 */
public class LondonOrderPizza extends AbstractOrderPizza {
    @Override
    AbstractPizza createPizza(String orderType) {
        AbstractPizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LondonCheesePizza();
        } else if ("pepper".equals(orderType)) {
            pizza = new LondonPepperPizza();
        }
        return pizza;
    }
}
