package com.ludi.study.designpattern.builder.improve;

/**
 * @author 陆迪
 * @date 2020/3/8 21:08
 */
public abstract class AbstractHouseBuilder {

    private House house = new House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House build() {
        return house;
    }

}
