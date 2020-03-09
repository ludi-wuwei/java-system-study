package com.ludi.study.designpattern.decorator;

/**
 * @author 陆迪
 * @date 2020/3/9 22:27
 */
public class Milk extends Decorator {
    public Milk(AbstractDrink drink) {
        super(drink);
        setDsc("牛奶");
        setPrice(22.0f);
    }
}
