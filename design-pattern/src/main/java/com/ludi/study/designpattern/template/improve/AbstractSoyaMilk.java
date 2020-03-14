package com.ludi.study.designpattern.template.improve;

/**
 * @author 陆迪
 * @date 2020/3/14 23:09
 */
public abstract class AbstractSoyaMilk {
    
    public final void make() {
        select();
        if (customerWantCondiments()) {
            add();
        }
        soak();
        beat();
    }

    protected void select() {
        System.out.println("select");

    }
    protected abstract void add();
    protected  void soak() {
        System.out.println("soak");
    }
    protected void beat() {
        System.out.println("beat");
    }

    protected boolean customerWantCondiments() {
        return true;
    }
}
