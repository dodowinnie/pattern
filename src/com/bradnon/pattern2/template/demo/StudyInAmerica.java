package com.bradnon.pattern2.template.demo;

/**
 * @Description: 具体子类
 * @author: Brandon
 * @date 2021/3/18 15:53
 */
public class StudyInAmerica extends StudyAbroad {
    @Override
    void lookingForSchool() {
        System.out.println("一、索取美国学校资料");
    }

    @Override
    void applyForSchool() {
        System.out.println("二、申请美国学校");
    }

    @Override
    void arriving() {
        System.out.println("六、抵达目标学校");
    }
}
