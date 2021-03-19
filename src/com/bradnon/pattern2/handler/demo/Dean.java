package com.bradnon.pattern2.handler.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/19 13:36
 */
public class Dean extends Leader {


    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= 10){
            System.out.println("院长批准 " + leaveDays + " 天假。。。。。");
        }else{
            if(getNext() != null){
                getNext().handleRequest(leaveDays);
            }else{
                System.out.println("院长到头了，无人处理。。。");
            }
        }
    }
}
