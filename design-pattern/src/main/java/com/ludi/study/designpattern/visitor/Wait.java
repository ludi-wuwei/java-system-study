package com.ludi.study.designpattern.visitor;

/**
 * @author 陆迪
 * @date 2020/3/16 17:46
 */
public class Wait extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男士给该歌手的评价是很待定");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女士给该歌手的评价是很待定");
    }
}
