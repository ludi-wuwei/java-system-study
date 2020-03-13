package com.ludi.study.designpattern.component;

/**
 * @author 陆迪
 * @date 2020/3/13 11:22
 */
public class Department extends AbstractOrganizationComponent {

    public Department(String name, String describe) {
        super(name, describe);
    }

    @Override
    public void print() {
        System.out.println(String.format("%s:%s", getName(), getDescribe()));
    }
}
