package com.ludi.study.designpattern.singleton.type2;

/**
 * @author ludi
 * @date 2020/3/6 21:53
 */
public class Singleton02 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton1.equals(singleton2));
    }

}


/**
 * 饿汉式（静态代码块）
 */
class Singleton {

    private Singleton() {
        System.out.println("Singleton 创建");
    }

    private final static Singleton instance;

    static {
        System.out.println("Singleton 实例 化");
        instance = new Singleton();
    }

    public static Singleton getInstance() {
        System.out.println("Singleton 获取");
        return Singleton.instance;
    }

}
