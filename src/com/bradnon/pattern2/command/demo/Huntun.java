package com.bradnon.pattern2.command.demo;

/**
 * @Description: 具体命令类
 * @author: Brandon
 * @date 2021/3/19 11:01
 */
public class Huntun implements Breakfast {

    private Chef chef;

    public Huntun(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void cooking() {
        chef.action();
    }
}
