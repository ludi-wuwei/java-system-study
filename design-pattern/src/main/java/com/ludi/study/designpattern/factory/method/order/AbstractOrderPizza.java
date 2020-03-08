package com.ludi.study.designpattern.factory.method.order;

import com.ludi.study.designpattern.factory.method.pizza.AbstractPizza;
import com.ludi.study.designpattern.factory.simple.order.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 陆迪
 * @date 2020/3/8 12:12
 */
public abstract class AbstractOrderPizza {

    abstract AbstractPizza createPizza(String orderType);


    public AbstractOrderPizza() {
        AbstractPizza pizza;
        String orderType;
        do {
            orderType = getOrderType();
            pizza = createPizza(orderType);

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
