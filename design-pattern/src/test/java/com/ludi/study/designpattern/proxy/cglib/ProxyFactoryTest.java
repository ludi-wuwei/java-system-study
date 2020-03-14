package com.ludi.study.designpattern.proxy.cglib;

import org.junit.Test;


public class ProxyFactoryTest {


    @Test
    public void interceptor() {

        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDao());
        TeacherDao teacherDao = (TeacherDao) proxyFactory.getProxyInstance();

        teacherDao.teach();
    }
}
