package com.bradnon.pattern2.adapter.origin;

/**
 * @Description: 适配者
 * @author: Brandon
 * @date 2021/3/17 15:28
 */
public class Adaptee {

    public void specificRequest(){
        System.out.println("适配者中的业务代码被调用");
    }
}
