package com.bradnon.pattern2.flyweight.origin;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 享元工厂角色
 * @author: Brandon
 * @date 2021/3/18 14:34
 */
public class FlyweightFactory {

    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key){
        Flyweight flyweight = flyweights.get(key);
        if(flyweight != null){
            System.out.println("具体享元" + key + "已经存在，被成功获取");
        }else{
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }

}
