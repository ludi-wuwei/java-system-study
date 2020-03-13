package com.ludi.study.designpattern.component;

/**
 * @author 陆迪
 * @date 2020/3/13 11:22
 */
public abstract class AbstractOrganizationComponent {

    private String name;
    private String describe;

    public AbstractOrganizationComponent(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    protected void add(AbstractOrganizationComponent component) {
        throw new UnsupportedOperationException();
    }
    public void remove(AbstractOrganizationComponent component) {
        throw new UnsupportedOperationException();
    }
    
    public abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
