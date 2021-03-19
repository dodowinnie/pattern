package com.bradnon.pattern2.template.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 15:36
 */
public class TemplageMethodPattern {

    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.templateMethod();
    }
}
