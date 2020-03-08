package com.ludi.study.designpattern.adapter.classadapter;

/**
 * @author 陆迪
 * @date 2020/3/8 22:14
 */
public class Voltage220V {

    public int outPut220V() {
        int src = 220;

        System.out.println("电压=" + src + "V");

        return src;
    }
}
