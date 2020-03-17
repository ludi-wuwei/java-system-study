package com.ludi.study.designpattern.iterator;

import java.util.Iterator;

/**
 * @author 陆迪
 * @date 2020/3/17 11:42
 */
public interface College {

    String getName();

    /**
     * 增加系的方法
     */
    void addDepartment(String name, String desc);

    /**
     *
     */
    Iterator<Department> createIterator();


}
