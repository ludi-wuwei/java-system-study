package com.ludi.study.designpattern.facade;

/**
 * @author 陆迪
 * @date 2020/3/13 20:56
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on() {
        System.out.println(" popcorn on");
    }

    public void off() {
        System.out.println("popcorn off");
    }

    public void pop() {
        System.out.println("popcorn is pop");
    }
}
