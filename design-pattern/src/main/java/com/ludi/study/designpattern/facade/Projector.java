package com.ludi.study.designpattern.facade;

/**
 * @author 陆迪
 * @date 2020/3/13 20:58
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("projector on");
    }
    public void off() {
        System.out.println("projector off");
    }

    public void focus() {
        System.out.println("projector focus");
    }
}
