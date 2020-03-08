package com.ludi.study.designpattern.factory.simple.order;

import com.ludi.study.designpattern.factory.simple.pizza.AbstractPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 陆迪
 * @date 2020/3/8 0:01
 */
public class OrderPizza2 {

    AbstractPizza pizza;
    String orderType;
    public OrderPizza2() {
        do {
            orderType = getOrderType();
            pizza = SimpleFactory.createPizza2(orderType);

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
