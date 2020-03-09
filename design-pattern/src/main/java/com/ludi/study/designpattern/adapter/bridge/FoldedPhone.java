package com.ludi.study.designpattern.adapter.bridge;

/**
 * @author 陆迪
 * @date 2020/3/9 21:15
 */
public class FoldedPhone extends AbstractPhone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        super.open();
        System.out.println("折叠手机 打开");
    }

    @Override
    protected void close() {
        super.close();
        System.out.println("折叠手机 关闭");
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("折叠手机 打电话");
    }
}
