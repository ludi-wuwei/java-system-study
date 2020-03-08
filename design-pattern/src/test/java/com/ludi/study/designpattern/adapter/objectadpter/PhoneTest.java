package com.ludi.study.designpattern.adapter.objectadpter;

import org.junit.Test;


public class PhoneTest {


    @Test
    public void charging() {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
