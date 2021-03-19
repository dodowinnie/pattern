package com.bradnon.pattern2.command.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/19 11:08
 */
public class BreakfastDemo {

    public static void main(String[] args) {
        Chef changfenChef = new ChangfenChef();
        Breakfast breakfast = new Changfen(changfenChef);
        Waiter waiter = new Waiter(breakfast);
        waiter.callChef();
    }
}
