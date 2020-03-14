package com.ludi.study.designpattern.proxy.statics;

/**
 * @author 陆迪
 * @date 2020/3/14 21:56
 */
public class TeacherDaoImpl implements TeacherDao{
    @Override
    public void teach() {
        System.out.println("teachDaoImpl teach");
    }
}
