package com.ludi.study.designpattern.facade;

import org.junit.Test;


public class HomeTheaterFacadeTest {


    @Test
    public void ready() {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.pause();
        homeTheaterFacade.pause();
        homeTheaterFacade.end();
    }
}
