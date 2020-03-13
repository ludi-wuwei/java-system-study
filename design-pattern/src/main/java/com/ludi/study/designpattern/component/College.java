package com.ludi.study.designpattern.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/13 11:22
 */
public class College extends AbstractOrganizationComponent {

    List<AbstractOrganizationComponent> organizationComponentList = new ArrayList<>();

    public College(String name, String describe) {
        super(name, describe);
    }


    @Override
    protected void add(AbstractOrganizationComponent component) {
        organizationComponentList.add(component);
    }

    @Override
    public void remove(AbstractOrganizationComponent component) {
        organizationComponentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println(String.format("%s:%s", getName(), getDescribe()));
        organizationComponentList
                .forEach(AbstractOrganizationComponent::print);
    }
}
