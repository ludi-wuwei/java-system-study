package com.ludi.study.designpattern.iterator;

/**
 * @author 陆迪
 * @date 2020/3/17 11:44
 */
public class Department {
    private String name;
    private String dsc;

    public Department(String name, String dsc) {
        this.name = name;
        this.dsc = dsc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }
}
