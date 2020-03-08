package com.ludi.study.designpattern.factory.method.pizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:11
 */
public class LondonPepperPizza extends AbstractPizza{
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦 胡椒 披萨 准备原料");
    }
}
