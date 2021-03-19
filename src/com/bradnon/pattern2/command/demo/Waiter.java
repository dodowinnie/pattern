package com.bradnon.pattern2.command.demo;

/**
 * @Description: 调用者类
 * @author: Brandon
 * @date 2021/3/19 11:06
 */
public class Waiter {

    private Breakfast breakfast;

    public Waiter(Breakfast breakfast) {
        this.breakfast = breakfast;
    }

    public void callChef(){
        breakfast.cooking();
    }
}
