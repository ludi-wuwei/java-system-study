package com.ludi.study.designpattern.adapter.bridge;

/**
 * @author 陆迪
 * @date 2020/3/9 21:13
 */
public class ViVo implements Brand{


    @Override
    public void open() {
        System.out.println("ViVo手机开机");
    }

    @Override
    public void close() {
        System.out.println("VoVo 关机");
    }

    @Override
    public void call() {
        System.out.println("VoVo打电话");
    }
}
