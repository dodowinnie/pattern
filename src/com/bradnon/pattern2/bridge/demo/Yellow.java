package com.bradnon.pattern2.bridge.demo;

/**
 * @Description: 具体实现化角色
 * @author: Brandon
 * @date 2021/3/18 11:40
 */
public class Yellow implements Color {
    @Override
    public String getColor() {
        return "yellow";
    }
}
