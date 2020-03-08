package com.ludi.study.designpattern.adapter.objectadpter;

/**
 * @author 陆迪
 * @date 2020/3/8 22:18
 */
public class Phone {

    /**
     * 充电
     */
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.output5V() == 5) {
            System.out.println("电压为5V 可以充电");
        } else if (voltage5V.output5V() > 5) {
            System.out.println("电压大于5V 无法充电！");
        }
    }
}
