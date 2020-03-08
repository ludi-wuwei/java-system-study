package com.ludi.study.designpattern.builder.improve;

/**
 * @author 陆迪
 * @date 2020/3/8 21:11
 */
public class HouseDirector {

    private AbstractHouseBuilder houseBuilder;

    public HouseDirector(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(AbstractHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}
