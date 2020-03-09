package com.ludi.study.designpattern.adapter.bridge;

/**
 * @author 陆迪
 * @date 2020/3/9 21:13
 */
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米 关机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}
