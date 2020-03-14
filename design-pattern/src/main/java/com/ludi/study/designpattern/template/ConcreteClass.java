package com.ludi.study.designpattern.template;

/**
 * @author 陆迪
 * @date 2020/3/14 23:04
 */
public class ConcreteClass extends AbstractClass {
    @Override
    protected void operation2() {
        System.out.println("ConcreteClass operation2");
    }

    @Override
    protected void operation3() {
        System.out.println("ConcreteClass operation3");
    }

    @Override
    protected void operation4() {
        System.out.println("ConcreteClass operation4");
    }
}
