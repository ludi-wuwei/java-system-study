package com.ludi.study.designpattern.builder;

import org.junit.Test;


public class AbstractHouseTest {


    @Test
    public void build() {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
