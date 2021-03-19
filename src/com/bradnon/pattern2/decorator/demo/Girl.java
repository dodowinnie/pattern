package com.bradnon.pattern2.decorator.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 14:07
 */
public class Girl extends Changer {

    public Girl(Morrigan morrigan) {
        super(morrigan);
    }

    @Override
    public void display() {
        System.out.println("莫妮卡变身少女。。。。");
    }
}
