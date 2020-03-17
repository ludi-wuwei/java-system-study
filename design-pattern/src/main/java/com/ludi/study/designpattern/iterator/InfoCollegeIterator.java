package com.ludi.study.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/17 11:41
 */
public class InfoCollegeIterator implements Iterator<Department> {

    private List<Department> departmentList;
    private int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index += 1;
            return true;
        }
    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }
}
