package com.ludi.study.designpattern.facade;

/**
 * @author 陆迪
 * @date 2020/3/13 21:04
 */
public class Stereo {

    private static Stereo instance = new Stereo();

    public static Stereo getInstance() {
        return instance;
    }
    public void on() {
        System.out.println("Stereo on");
    }
    public void off() {
        System.out.println("Stereo off");
    }

    public void up() {
        System.out.println("Stereo up");
    }
}
