package com.ludi.study.designpattern.decorator;

import org.junit.Test;



public class CoffeeTest {


    @Test
    public void cost() {
        AbstractDrink order = new LongBlack();
        System.out.println("费用1=" + order.cost());
        System.out.println("描述=" + order.getDsc());

        //加一分牛奶
        order = new Milk(order);

        System.out.println("order 加入一份牛奶 费用" + order.cost());
        System.out.println("order 加入一份牛奶 描述" + order.getDsc());

        //加入巧克力
        order = new Chocolate(order);



    }
}
