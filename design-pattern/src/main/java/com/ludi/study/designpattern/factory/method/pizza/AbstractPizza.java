package com.ludi.study.designpattern.factory.method.pizza;

/**
 * @author 陆迪
 * @date 2020/3/8 12:09
 */
public abstract class AbstractPizza {

    protected String name;

    /**
     * 准备原材料，不同的披萨不一样，因此我们做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking");
    }

    public void cut() {
        System.out.println(name + "cut");
    }

    /**
     * 打包
     */
    public void box() {
        System.out.println(name + "boxing");
    }

    public void setName(String name) {
        this.name = name;
    }
}
