package com.ludi.study.designpattern.template;

/**
 * @author 陆迪
 * @date 2020/3/14 23:09
 */
public abstract class AbstractSoyaMilk {
    
    public final void make() {
        select();
        add();
        soak();
        beat();
    }

    protected abstract void select();
    protected abstract void add();
    protected abstract void soak();
    protected abstract void beat();
}
