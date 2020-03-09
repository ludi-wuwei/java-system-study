package com.ludi.study.designpattern.decorator;

/**
 * @author 陆迪
 * @date 2020/3/9 22:27
 */
public class Soy extends Decorator {

    public Soy(AbstractDrink drink) {
        super(drink);
        setDsc("豆浆");
        setPrice(11.4f);
    }
}
