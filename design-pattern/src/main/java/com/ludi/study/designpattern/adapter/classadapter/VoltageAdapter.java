package com.ludi.study.designpattern.adapter.classadapter;

/**
 * @author 陆迪
 * @date 2020/3/8 22:16
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{


    @Override
    public int output5V() {
        int src = outPut220V();
        int dst;
        dst = src / 44;
        System.out.println("转换电压为：" + dst);
        return dst;
    }
}
