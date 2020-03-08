package com.ludi.study.designpattern.factory.method.order;

import com.ludi.study.designpattern.factory.method.pizza.AbstractPizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:36
 */
public interface AbstractFactory {

   AbstractPizza createPizza(String orderType);
}
