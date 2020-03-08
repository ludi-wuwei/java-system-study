package com.ludi.study.designpattern.prototype;

import org.junit.Test;


public class SheepTest {


    @Test
    public void testCopy() {
        Sheep sheep = new Sheep("路西", 1, "白色");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep.toString());
        System.out.println(sheep1.toString());

        assert sheep == sheep1;
    }

}
