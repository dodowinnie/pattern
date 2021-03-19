package com.bradnon.pattern2.command.demo;

/**
 * @Description: 具体接受者类
 * @author: Brandon
 * @date 2021/3/19 11:05
 */
public class HunTunChef implements Chef {
    @Override
    public void action() {
        System.out.println("馄饨师傅做馄饨。。。");
    }
}
