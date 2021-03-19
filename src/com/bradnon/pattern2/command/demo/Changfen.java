package com.bradnon.pattern2.command.demo;

/**
 * @Description: 具体命令类
 * @author: Brandon
 * @date 2021/3/19 11:01
 */
public class Changfen implements Breakfast {

    private Chef chef;

    public Changfen(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void cooking() {
        chef.action();
    }
}
