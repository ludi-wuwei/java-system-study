package com.ludi.study.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 陆迪
 * @date 2020/3/14 22:40
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);

        //创建子类对象即代理对象
        return enhancer.create();

    }

    public void interceptor() {
        System.out.println("proxy interceptor");
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result;
        System.out.println("cglib 代理开始前");
        result = method.invoke(target, args);
        System.out.println("cglib 代理结束后");

        return result;
    }
}
