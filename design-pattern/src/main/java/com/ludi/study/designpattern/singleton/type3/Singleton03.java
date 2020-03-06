package com.ludi.study.designpattern.singleton.type3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/6 22:43
 */
public class Singleton03 {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        assert singleton1.equals(singleton2);

        List<Singleton> singletonList = new ArrayList<>();
        List<Runnable> runnableList = new ArrayList<>();
        for (int i=1; i<100000; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.getInstance();
                    singletonList.add(singleton);
                }
            };
            runnableList.add(runnable);
        }
        runnableList.forEach(Runnable::run);

        while (singletonList.size() != 99999) {
            System.out.println(singletonList.size());
        }

        singletonList.forEach(singleton -> System.out.println(singleton.hashCode()));

    }
}



/**
 * 懒汉式（线程不安全）
 */
class Singleton {

    private Singleton() {
        System.out.println("Singleton 创建");
    }

    private static Singleton instance;



    public static Singleton getInstance() {
        System.out.println("Singleton 获取");
        if (instance == null) {
            Singleton.instance = new Singleton();
        }
        return Singleton.instance;
    }

}