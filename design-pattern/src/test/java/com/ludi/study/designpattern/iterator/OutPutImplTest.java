package com.ludi.study.designpattern.iterator;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class OutPutImplTest {

    @Test
    public void test() {
        List<College> colleges = new ArrayList<>();
        colleges.add(new InfoCollege());
        colleges.add(new ComputerCollege());
        OutPutImpl outPut = new OutPutImpl(colleges);
        outPut.printCollege();
    }

}
