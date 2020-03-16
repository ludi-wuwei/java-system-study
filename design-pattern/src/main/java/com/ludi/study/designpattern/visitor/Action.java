package com.ludi.study.designpattern.visitor;

/**
 * @author 陆迪
 * @date 2020/3/16 17:24
 */
public abstract class Action {

    public abstract void getManResult(Man man);
    public abstract void getWomanResult(Woman woman);
}
