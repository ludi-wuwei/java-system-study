package com.ludi.study.designpattern.decorator;

/**
 * @author 陆迪
 * @date 2020/3/9 22:25
 */
public class Chocolate extends Decorator {

    public Chocolate(AbstractDrink drink) {
        super(drink);
        setDsc("巧克力");
        setPrice(32.5f);
    }
}
