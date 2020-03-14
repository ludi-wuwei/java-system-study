package com.ludi.study.designpattern.proxy.dynamic;


import org.junit.Test;


public class ProxyFactoryTest {

    @Test
    public void getTarget() {
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();

        System.out.println("proxyInstance=" + proxyInstance.getClass());
        proxyInstance.teach();
    }
}
