package com.ludi.study.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author 陆迪
 * @date 2020/3/16 17:37
 */
public class ObjectStructure {

    private List<AbstractPerson> personList = new LinkedList<>();


    public void attach(AbstractPerson person) {
        personList.add(person);
    }

    public void detach(AbstractPerson person) {
        personList.remove(person);
    }

    public void display(Action action) {
        for (AbstractPerson person : personList) {
            person.accept(action);
        }
    }
}
