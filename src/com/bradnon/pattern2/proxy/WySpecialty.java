package com.bradnon.pattern2.proxy;

/**
 * @author Brandon
 * @Description: 真实主题
 * @date 2021/3/1714:13
 */
public class WySpecialty implements Specialty{
    @Override
    public void display() {
        System.out.println("真实主题。。。。");
    }
}
