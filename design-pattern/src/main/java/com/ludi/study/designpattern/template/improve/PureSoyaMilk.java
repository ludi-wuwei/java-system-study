package com.ludi.study.designpattern.template.improve;

/**
 * @author 陆迪
 * @date 2020/3/14 23:19
 */
public class PureSoyaMilk extends AbstractSoyaMilk {
    @Override
    protected void add() {

    }

    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
