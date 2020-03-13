package com.ludi.study.designpattern.flyweight;

/**
 * @author 陆迪
 * @date 2020/3/13 23:12
 */
public class ConcreteWebSite extends AbstractWebSite {

    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void user() {
        System.out.println("网站的发布形式为：" + type);
    }
}
