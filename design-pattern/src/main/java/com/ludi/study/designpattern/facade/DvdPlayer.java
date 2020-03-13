package com.ludi.study.designpattern.facade;

/**
 * @author 陆迪
 * @date 2020/3/13 20:48
 */
public class DvdPlayer {
    private static DvdPlayer instance = new DvdPlayer();

    public static DvdPlayer getInstance() {
        return instance;
    }

    public void on() {
        System.out.println("did on");
    }

    public void off() {
        System.out.println("did off");
    }
    public void play() {
        System.out.println("dvd play");
    }

    public void pause() {
        System.out.println("did pause");
    }
}
