package com.ludi.study.designpattern.component;


import org.junit.Test;

public class AbstractOrganizationComponentTest {


    @Test
    public void test() {
        University university = new University("北大", "北京大学");

        College college1 = new College("中文系", "北大中文系");
        Department department1 = new Department("部门1", "放弃的部门1");
        Department department2 = new Department("部门2", "放弃的部门2");
        college1.add(department1);
        college1.add(department2);

        College college2 = new College("美女系", "北大美女系");
        Department department3 = new Department("美女1", "争取的美女1");
        Department department4 = new Department("美女2", "争取的美女2");
        college2.add(department3);
        college2.add(department4);

        university.add(college1);
        university.add(college2);

        university.print();


    }
}
