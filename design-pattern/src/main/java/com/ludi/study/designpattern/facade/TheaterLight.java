package com.ludi.study.designpattern.facade;

/**
 * @author 陆迪
 * @date 2020/3/13 21:05
 */
public class TheaterLight {

    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("TheaterLight on");
    }
    public void off() {
        System.out.println("TheaterLight off");
    }

    public void dim() {
        System.out.println("TheaterLight dim");
    }

    public void bright() {
        System.out.println("TheaterLight bright");
    }
}
