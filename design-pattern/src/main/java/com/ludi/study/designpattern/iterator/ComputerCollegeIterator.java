package com.ludi.study.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author 陆迪
 * @date 2020/3/17 11:41
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    private Department[] departments;
    private int position;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Department next() {
        Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public void remove() {
    }
}
