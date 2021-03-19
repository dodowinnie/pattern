package com.bradnon.pattern2.decorator.demo;

/**
 * @Description: 具体构件
 * @author: Brandon
 * @date 2021/3/18 13:56
 */
public class Original implements Morrigan {


    @Override
    public void display() {
        System.out.println("原身是个可爱少女。。。。");
    }

    private String setType(String type){
        return type;
    }


}
