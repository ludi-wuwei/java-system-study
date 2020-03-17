package com.ludi.study.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/17 12:02
 */
public class InfoCollege implements College {


    List<Department> departmentList;


    public InfoCollege() {
        departmentList = new ArrayList<Department>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        // TODO Auto-generated method stub
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator<Department> createIterator() {
        // TODO Auto-generated method stub
        return new InfoCollegeIterator(departmentList);
    }
}
