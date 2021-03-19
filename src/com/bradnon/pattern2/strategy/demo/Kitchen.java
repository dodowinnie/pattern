package com.bradnon.pattern2.strategy.demo;

/**
 * @Description: 环境类
 * @author: Brandon
 * @date 2021/3/18 16:29
 */
public class Kitchen {

    private CrabCooking crabCooking;

    public CrabCooking getCrabCooking() {
        return crabCooking;
    }

    public void setCrabCooking(CrabCooking crabCooking) {
        this.crabCooking = crabCooking;
    }

    public void cookCrabs(){
        crabCooking.cookingMethod();
    }
}
