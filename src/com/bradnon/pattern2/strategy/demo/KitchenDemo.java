package com.bradnon.pattern2.strategy.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 16:29
 */
public class KitchenDemo {

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
//        CrabCooking crabCooking = new SteamedCrabs();
        CrabCooking crabCooking = new BraisedCrabs();
        kitchen.setCrabCooking(crabCooking);
        kitchen.cookCrabs();
    }
}
