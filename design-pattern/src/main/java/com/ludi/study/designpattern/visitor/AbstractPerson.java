package com.ludi.study.designpattern.visitor;

/**
 * @author 陆迪
 * @date 2020/3/16 17:27
 */
public abstract class AbstractPerson {

    public abstract void accept(Action action);
}
