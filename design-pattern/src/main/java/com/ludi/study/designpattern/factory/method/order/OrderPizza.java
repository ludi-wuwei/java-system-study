package com.ludi.study.designpattern.factory.method.order;

import com.ludi.study.designpattern.factory.method.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 陆迪
 * @date 2020/3/8 12:48
 */
public class OrderPizza {

    AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
        setFactory(abstractFactory);

    }
    public void setFactory(AbstractFactory factory) {
        AbstractPizza pizza;
        String orderType;
        do {
            orderType = getOrderType();
            pizza = factory.createPizza(orderType);

            if (pizza != null) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
                break;
            }
        }while (true);

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
