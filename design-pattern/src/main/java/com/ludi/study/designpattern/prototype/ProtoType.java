package com.ludi.study.designpattern.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 陆迪
 * @date 2020/3/8 13:56
 */
public class ProtoType {
    
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.ludi.study");

        SheepBean sheepBean = (SheepBean) applicationContext.getBean("sheepBean");

    }
}
