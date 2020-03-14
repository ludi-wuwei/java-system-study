package com.ludi.study.designpattern.template;

/**
 * @author 陆迪
 * @date 2020/3/14 23:12
 */
public class RedBeanSoyaMilk extends AbstractSoyaMilk {
    @Override
    protected void select() {
        System.out.println("选择上好的红豆");
    }

    @Override
    protected void add() {
        System.out.println("选择上好的红豆");

    }

    @Override
    protected void soak() {
        System.out.println("选择上好的红豆");

    }

    @Override
    protected void beat() {
        System.out.println("选择上好的红豆");

    }
}
