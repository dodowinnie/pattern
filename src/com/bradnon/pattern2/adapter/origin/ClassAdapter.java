package com.bradnon.pattern2.adapter.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 15:29
 */
public class ClassAdapter extends Adaptee implements Target {
    @Override
    public void request() {
        specificRequest();
    }
}
