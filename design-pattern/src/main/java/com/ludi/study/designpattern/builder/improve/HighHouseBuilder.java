package com.ludi.study.designpattern.builder.improve;

/**
 * @author 陆迪
 * @date 2020/3/8 21:11
 */
public class HighHouseBuilder extends AbstractHouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基100米");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼的砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
