package com.ludi.study.designpattern.factory.simple.pizza;

/**
 * @author 陆迪
 * @date 2020/3/7 22:50
 */
public class CheesePizza extends AbstractPizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪制作准备材料！");
    }
}
