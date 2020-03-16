package com.ludi.study.designpattern.visitor;

/**
 * @author 陆迪
 * @date 2020/3/16 17:27
 */
public class Woman extends AbstractPerson {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
