package com.ludi.study.designpattern.factory.order;

import com.ludi.study.designpattern.factory.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 陆迪
 * @date 2020/3/7 23:03
 */
public class OrderPizza {

    //    public OrderPizza() {
//        AbstractPizza pizza = null;
//        String orderType;
//        do {
//            orderType = getOrderType();
//            if ("greek".equals(orderType)) {
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            } else if ("cheese".equals(orderType)) {
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            } else {
//                break;
//            }
//
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        } while (true);
//    }
    SimpleFactory simpleFactory;
    AbstractPizza pizza;

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType;

        this.simpleFactory = simpleFactory;

        do {
            orderType = getOrderType();
            pizza = simpleFactory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.print("不存在的pizza类型！");
                break;
            }
        } while (true);
    }

    public OrderPizza(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);

    }

    private String getOrderType() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
