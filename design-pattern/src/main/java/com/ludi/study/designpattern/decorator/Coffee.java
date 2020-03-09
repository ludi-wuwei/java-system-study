package com.ludi.study.designpattern.decorator;

/**
 * @author 陆迪
 * @date 2020/3/9 22:15
 */
public  class Coffee extends AbstractDrink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
