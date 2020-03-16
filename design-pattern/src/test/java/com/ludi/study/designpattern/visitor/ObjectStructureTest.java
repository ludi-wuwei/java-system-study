package com.ludi.study.designpattern.visitor;

import org.junit.Test;


public class ObjectStructureTest {


    @Test
    public void attach() {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        objectStructure.display(new Fail());
    }

    @Test
    public void detach() {
    }

    @Test
    public void display() {
    }
}
