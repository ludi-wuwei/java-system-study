package com.ludi.study.designpattern.proxy.statics;

/**
 * @author 陆迪
 * @date 2020/3/14 21:57
 */
public class TeacherDaoProxy {

    private TeacherDao teacherDao;

    public TeacherDaoProxy(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public void teach() {
        System.out.println("代理开始");
        teacherDao.teach();
        System.out.println("代理结束");
    }
}
