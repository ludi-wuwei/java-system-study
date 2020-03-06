package com.ludi.study.designpattern.singleton.type6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/6 23:00
 */
public class Single06 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        List<Singleton> singletonList = new ArrayList<>();
        List<Runnable> runnableList = new ArrayList<>();
        for (int i = 1; i < 100000000; i++) {
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

        while (singletonList.size() != 99999999) {
//            System.out.println(singletonList.size());
        }
        long endTime = System.currentTimeMillis();

//        singletonList.forEach(singleton -> System.out.println(singleton.hashCode()));

        System.out.println(endTime - startTime);

    }
}


/**
 * 懒汉式（线程安全, 静态内部类）
 */
class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }

    private static class SingletonInstance {
        private final static Singleton INSTANCE = new Singleton();

        private SingletonInstance() {
        }
    }
}