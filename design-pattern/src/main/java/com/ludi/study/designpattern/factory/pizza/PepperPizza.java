package com.ludi.study.designpattern.factory.pizza;

import jdk.nashorn.internal.parser.JSONParser;

/**
 * @author 陆迪
 * @date 2020/3/7 23:21
 */
public class PepperPizza extends AbstractPizza{

    @Override
    public void prepare() {
        System.out.println("给胡椒披萨准备原材料！");
    }



}
