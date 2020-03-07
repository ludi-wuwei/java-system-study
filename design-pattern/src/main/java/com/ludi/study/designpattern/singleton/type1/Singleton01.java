package com.ludi.study.designpattern.singleton.type1;

/**
 * @author ludi
 * @date
 */
public class Singleton01 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1.equals(singleton2));
    }
}


/**
 * 饿汉式（静态变量）
 */
class Singleton {
    private Singleton() {
        System.out.println("Singleton 创建化");
    }

    private final static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        System.out.println("Singleton 获取");
        return Singleton.INSTANCE;
    }
}

