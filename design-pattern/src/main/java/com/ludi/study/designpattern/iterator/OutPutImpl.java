package com.ludi.study.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/17 12:05
 */
public class OutPutImpl {

    /**
     * -学院集合
     */

    private List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /**
     * 遍历所有学院,然后调用printDepartment 输出各个学院的系
     */
    public void printCollege() {

        //从collegeList 取出所有学院, Java 中的 List 已经实现Iterator

        for (College college : collegeList) {
            //取出一个学院
            System.out.println("=== " + college.getName() + "=====");
            //得到对应迭代器
            printDepartment(college.createIterator());
        }
    }


    /**
     * 输出 学院输出 系
     */

    private void printDepartment(Iterator<Department> iterator) {
        while(iterator.hasNext()) {
            Department d = iterator.next();
            System.out.println(d.getName());
        }
    }

}
