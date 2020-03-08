package com.ludi.study.designpattern.prototype.improve;

import java.util.Objects;

/**
 * @author 陆迪
 * @date 2020/3/8 13:29
 */

public class Sheep implements Cloneable{

    private String name;
    private Integer age;
    private String color;

    public Sheep() {
    }

    public Sheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sheep)) return false;
        Sheep sheep = (Sheep) o;
        return Objects.equals(getName(), sheep.getName()) &&
                Objects.equals(getAge(), sheep.getAge()) &&
                Objects.equals(getColor(), sheep.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getColor());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Sheep sheep;

        sheep = (Sheep) super.clone();

        return sheep;
    }

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

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
