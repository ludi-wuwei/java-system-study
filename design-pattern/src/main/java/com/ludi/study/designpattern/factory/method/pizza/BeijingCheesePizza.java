package com.ludi.study.designpattern.factory.method.pizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:09
 */
public class BeijingCheesePizza extends AbstractPizza{
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京 奶酪 披萨 准备原料");
    }
}
