package com.ludi.study.designpattern.flyweight;

import org.junit.Test;


public class WebSiteFactoryTest {


    @Test
    public void getWebSite() {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        AbstractWebSite webSite1 = webSiteFactory.getWebSite("新闻");
        AbstractWebSite webSite2 = webSiteFactory.getWebSite("体育");

        webSite1.user();
        webSite2.user();

    }

    @Test
    public void getWebSiteCount() {

        Integer.valueOf(1);
    }
}
