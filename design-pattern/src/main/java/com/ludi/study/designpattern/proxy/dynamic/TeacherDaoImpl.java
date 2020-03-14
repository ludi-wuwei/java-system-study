package com.ludi.study.designpattern.proxy.dynamic;

/**
 * @author 陆迪
 * @date 2020/3/14 22:08
 */
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public void teach() {
        System.out.println("teach ing");
    }
}
