package com.bradnon.pattern2.strategy.demo;

/**
 * @Description: 具体实现类
 * @author: Brandon
 * @date 2021/3/18 16:28
 */
public class SteamedCrabs implements CrabCooking {


    @Override
    public void cookingMethod() {
        System.out.println("清蒸大闸蟹。。。。");
    }
}
