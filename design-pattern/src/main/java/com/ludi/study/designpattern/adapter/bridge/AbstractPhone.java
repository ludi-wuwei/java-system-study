package com.ludi.study.designpattern.adapter.bridge;

/**
 * @author 陆迪
 * @date 2020/3/9 21:14
 */
public abstract class AbstractPhone {

    private Brand brand;

    public AbstractPhone(Brand brand) {
        super();
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }
}
