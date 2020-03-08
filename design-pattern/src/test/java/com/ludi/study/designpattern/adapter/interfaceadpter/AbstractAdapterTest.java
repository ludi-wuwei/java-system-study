package com.ludi.study.designpattern.adapter.interfaceadpter;

import org.junit.Test;


public class AbstractAdapterTest {


    @Test
    public void m1() {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
        abstractAdapter.m1();
    }

    @Test
    public void m2() {
    }

    @Test
    public void m3() {
    }

    @Test
    public void m4() {
    }
}
