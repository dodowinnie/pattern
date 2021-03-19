package com.bradnon.pattern2.bridge.demo;

/**
 * @Description:扩展抽象化角色
 * @author: Brandon
 * @date 2021/3/18 11:43
 */
public class HandBag extends Bag {
    @Override
    public String getName() {
        return color.getColor() + " HandBag";
    }
}
