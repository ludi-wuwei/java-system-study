package com.ludi.study.designpattern.prototype;

/**
 * @author 陆迪
 * @date 2020/3/8 13:32
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("路西", 1, "白色");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println(sheep.toString());
        System.out.println(sheep1.toString());

        assert sheep != sheep1;
    }


}
