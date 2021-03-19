package com.bradnon.pattern2.bridge.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 11:38
 */
abstract class Bag {

    Color color;

    public void setColor(Color color){
        this.color = color;
    }

    public abstract String getName();
}
