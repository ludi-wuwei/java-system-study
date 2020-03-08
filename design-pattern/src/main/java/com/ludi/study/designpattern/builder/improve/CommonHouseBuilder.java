package com.ludi.study.designpattern.builder.improve;

/**
 * @author 陆迪
 * @date 2020/3/8 21:11
 */
public class CommonHouseBuilder extends AbstractHouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基5米");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子封顶");
    }
}
