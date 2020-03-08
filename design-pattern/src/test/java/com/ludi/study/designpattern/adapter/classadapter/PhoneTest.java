package com.ludi.study.designpattern.adapter.classadapter;

import org.junit.Test;


public class PhoneTest {

    @Test
    public void charging() {
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
