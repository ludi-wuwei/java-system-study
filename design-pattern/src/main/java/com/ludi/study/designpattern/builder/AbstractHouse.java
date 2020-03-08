package com.ludi.study.designpattern.builder;

/**
 * @author 陆迪
 * @date 2020/3/8 20:50
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
