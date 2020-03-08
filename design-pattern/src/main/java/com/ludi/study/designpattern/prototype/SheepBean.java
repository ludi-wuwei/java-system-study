package com.ludi.study.designpattern.prototype;

import org.springframework.stereotype.Component;

/**
 * @author 陆迪
 * @date 2020/3/8 15:01
 */
@Component
public class SheepBean {

    private String name;
    private Integer age;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
