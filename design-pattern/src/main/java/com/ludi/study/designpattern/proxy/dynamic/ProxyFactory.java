package com.ludi.study.designpattern.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * @author 闄嗚开
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        /*
         * loader  指定当前目标对象使用的类加载器，获取加载器的方法固定
         * interfaces 目标对象实现的接口类型，使用泛型方法确认类型
         * handler 事件处理，执行目标对象的方法时，会触发事件处理器的方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("JDK代理开始");
                    Object returnResult;
                    returnResult = method.invoke(target, args);
                    System.out.println("JDK代理提交");
                    return returnResult;
                });
    }
}
