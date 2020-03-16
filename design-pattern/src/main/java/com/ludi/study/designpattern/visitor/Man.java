package com.ludi.study.designpattern.visitor;

import com.ludi.study.designpattern.adapter.bridge.AbstractPhone;

/**
 * @author 陆迪
 * @date 2020/3/16 17:26
 */
public class Man extends AbstractPerson {
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
