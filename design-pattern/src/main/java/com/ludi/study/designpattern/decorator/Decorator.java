package com.ludi.study.designpattern.decorator;

/**
 * @author 陆迪
 * @date 2020/3/9 22:20
 */
public class Decorator extends AbstractDrink {
    private AbstractDrink drink;

    public Decorator(AbstractDrink drink) {
        this.drink = drink;
    }

    @Override
    public String getDsc() {
        return String.format(
                "%s %s && %s %s",
                super.getDsc(), super.getPrice(), drink.getDsc(), drink.getPrice());
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }
}
