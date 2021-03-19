package com.bradnon.pattern2.strategy.origin;

/**
 * @Description: 环境类
 * @author: Brandon
 * @date 2021/3/18 16:23
 */
public class Context {

    private Stragety stragety;

    public Stragety getStragety() {
        return stragety;
    }

    public void setStragety(Stragety stragety) {
        this.stragety = stragety;
    }

    public void stargetyMethod(){
        stragety.stargetyMethod();
    }
}
