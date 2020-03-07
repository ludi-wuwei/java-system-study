package com.ludi.study.designpattern.factory.pizza;

/**
 * @author 陆迪
 * @date 2020/3/7 22:51
 */
public  class GreekPizza extends AbstractPizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备原材料!");
    }
}
