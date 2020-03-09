package com.ludi.study.designpattern.adapter.bridge;

import org.junit.Test;


public class FoldedPhoneTest {


    @Test
    public void open() {
        FoldedPhone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();
    }

    @Test
    public void close() {
    }

    @Test
    public void call() {
    }
}
