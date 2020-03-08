package com.ludi.study.designpattern.builder;

/**
 * @author 陆迪
 * @date 2020/3/8 20:52
 */
public class HighHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("高楼打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼封顶");
    }
}
