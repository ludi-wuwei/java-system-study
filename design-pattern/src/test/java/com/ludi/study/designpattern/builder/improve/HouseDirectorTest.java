package com.ludi.study.designpattern.builder.improve;

import org.junit.Test;


public class HouseDirectorTest {

    @Test
    public void constructHouse() {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(commonHouseBuilder);

        House house = houseDirector.constructHouse();

        System.out.println(house.toString());
    }
}
