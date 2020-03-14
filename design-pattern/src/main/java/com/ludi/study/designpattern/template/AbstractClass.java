package com.ludi.study.designpattern.template;

/**
 * @author 陆迪
 * @date 2020/3/14 23:02
 */
public abstract class AbstractClass {
    /**
     * 定义流程
     */
    public void template() {
        operation2();
        operation4();
        operation3();
    }

    protected abstract void operation2();
    protected abstract void operation3();
    protected abstract void operation4();

}
