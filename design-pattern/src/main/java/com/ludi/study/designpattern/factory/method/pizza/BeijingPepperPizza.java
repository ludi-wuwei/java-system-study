package com.ludi.study.designpattern.factory.method.pizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:10
 */
public class BeijingPepperPizza extends AbstractPizza{


    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京 胡椒 披萨 准备原料");
    }
}
