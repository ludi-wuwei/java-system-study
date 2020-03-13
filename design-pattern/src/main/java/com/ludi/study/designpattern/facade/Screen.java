package com.ludi.study.designpattern.facade;

/**
 * @author 陆迪
 * @date 2020/3/13 21:02
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance() {
        return instance;
    }
    public void up() {
        System.out.println("Screen up");
    }
    public void down() {
        System.out.println("Screen down");
    }

}
