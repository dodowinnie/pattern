package com.bradnon.pattern2.adapter.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 15:30
 */
public class Client {

    public static void main(String[] args) {
        // 类适配
//        Target target = new ClassAdapter();
//        target.request();
        // 对象适配
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();

    }
}
