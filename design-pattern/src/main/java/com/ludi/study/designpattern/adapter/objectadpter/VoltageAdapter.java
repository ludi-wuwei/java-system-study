package com.ludi.study.designpattern.adapter.objectadpter;

/**
 * @author 陆迪
 * @date 2020/3/8 22:16
 */
public class VoltageAdapter  implements Voltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.outPut220V();
            dst = src / 44;
            System.out.println("转换电压为：" + dst);
        }
        return dst;

    }
}
