package com.ludi.study.designpattern.factory.method.order;

import java.util.Calendar;

/**
 * @author 陆迪
 * @date 2020/3/8 12:29
 */
public class PizzaStore {

    public static void main(String[] args) {
//      new BeijingOrderPizza();
        new OrderPizza(new BeijingFactory());

        Calendar calendar = Calendar.getInstance();
    }
}
