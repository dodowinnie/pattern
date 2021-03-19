package com.bradnon.pattern2.decorator.demo;

/**
 * @Description: 具体装饰角色，女妖
 * @author: Brandon
 * @date 2021/3/18 14:00
 */
public class Succubus extends Changer {

    public Succubus(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        System.out.println("莫妮卡变身女妖。。。。。");
    }
}
