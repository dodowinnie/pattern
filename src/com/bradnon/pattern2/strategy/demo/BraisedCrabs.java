package com.bradnon.pattern2.strategy.demo;

/**
 * @Description: 具体策略类
 * @author: Brandon
 * @date 2021/3/18 16:28
 */
public class BraisedCrabs implements CrabCooking {
    @Override
    public void cookingMethod() {
        System.out.println("红烧大闸蟹。。。。");
    }
}
