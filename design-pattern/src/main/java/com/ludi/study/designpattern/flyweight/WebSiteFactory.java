package com.ludi.study.designpattern.flyweight;

import java.util.HashMap;

/**
 * @author 陆迪
 * @date 2020/3/13 23:12
 */
public class WebSiteFactory {

    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public AbstractWebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            ConcreteWebSite concreteWebSite = new ConcreteWebSite(type);
            pool.put(type, concreteWebSite);
        }
        return pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
