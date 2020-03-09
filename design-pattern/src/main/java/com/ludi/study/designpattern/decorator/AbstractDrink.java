package com.ludi.study.designpattern.decorator;

/**
 * @author 陆迪
 * @date 2020/3/9 22:14
 */
public abstract class AbstractDrink {
    private String dsc;
    private float price = 0.0f;

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
