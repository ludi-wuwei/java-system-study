package com.ludi.study.designpattern.singleton.type7;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/6 23:03
 */
public class Singleton07 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        assert singleton1.hashCode() == singleton2.hashCode();

        List<Singleton> singletonList = new ArrayList<>();
        List<Runnable> runnableList = new ArrayList<>();
        for (int i = 1; i < 100000000; i++) {
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    Singleton singleton = Singleton.INSTANCE;
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
 * 懒汉式（枚举）
 */
enum  Singleton {

    /**
     *
     */
    INSTANCE;

    public void sayOk() {
        System.out.println("ok");
    }
}