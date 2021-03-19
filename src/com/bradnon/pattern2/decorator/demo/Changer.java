package com.bradnon.pattern2.decorator.demo;

/**
 * @Description: 抽象装饰角色
 * @author: Brandon
 * @date 2021/3/18 13:59
 */
public class Changer implements Morrigan {

    private Morrigan morrigan;

    public Changer(Morrigan morrigan) {
        this.morrigan = morrigan;
    }

    @Override
    public void display() {
        morrigan.display();

    }
}
