package com.ludi.study.designpattern.prototype.improve;

import org.junit.Test;


public class SheepTest {

    @Test
    public void testClone() {
        Sheep sheep = new Sheep("路西", 1, "白色");

        Sheep sheep1 = null;
        try {
            sheep1 = (Sheep) sheep.clone();

            System.out.println(sheep.toString());
            System.out.println(sheep1.toString());

            assert sheep.equals(sheep1);
            assert sheep != sheep1;

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }



    }

}
