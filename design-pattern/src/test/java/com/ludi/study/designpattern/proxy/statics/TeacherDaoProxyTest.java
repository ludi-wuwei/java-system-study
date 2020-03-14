package com.ludi.study.designpattern.proxy.statics;

import org.junit.Test;


public class TeacherDaoProxyTest {


    @Test
    public void teach() {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDaoImpl());

        teacherDaoProxy.teach();
    }
}
