package com.ludi.study.designpattern.factory.method.pizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:10
 */
public class LondonCheesePizza extends AbstractPizza{
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦 奶酪 披萨 准备原料");
    }
}
