package com.bradnon.pattern2.handler.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/19 13:36
 */
public class DepartmentHead extends Leader {


    @Override
    public void handleRequest(int leaveDays) {
        if(leaveDays <= 7){
            System.out.println("系主任批准 " + leaveDays + " 天假。。。。。");
        }else{
            if(getNext() != null){
                getNext().handleRequest(leaveDays);
            }else{
                System.out.println("系主任到头了，无人处理。。。");
            }
        }
    }
}
