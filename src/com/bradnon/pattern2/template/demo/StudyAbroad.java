package com.bradnon.pattern2.template.demo;

/**
 * @Description: 抽象类
 * @author: Brandon
 * @date 2021/3/18 15:43
 */
abstract class StudyAbroad {

    // 模板方法
    public void templateMethod(){
        lookingForSchool();
        applyForSchool();
        applyForPassport();
        applyForVisa();
        readyGoAbroad();
        arriving();

    }

    public void applyForPassport(){
        System.out.println("三、办理因私出国护照、出境卡和公证");
        System.out.println("  (1)持录取通知书、本人户口本或身份证向户口所在地公安机关申请办理因私出国护照和出境卡");
        System.out.println("  (2)办理出生公证书，学历、学位和成绩公证，经历证书。亲属关系公证，经济担保公证");
    }

    public void applyForVisa(){
        System.out.println("四、申请签证");
        System.out.println("  (1)balabalabalabalabalabalabalabalabalabalabalabalabalabalabalabala");
        System.out.println("  (2)balabalabalabalabalabalabalabalabalabalabalabalabalabalabalabala");
    }

    public void readyGoAbroad(){
        System.out.println("五、体检、订机票、准备行装");
        System.out.println("  (1)balabalabalabalabalabalabalabalabalabalabalabalabalabalabalabala");
        System.out.println("  (2)balabalabalabalabalabalabalabalabalabalabalabalabalabalabalabala");
    }


    abstract void lookingForSchool(); // 索取学校资料
    abstract void applyForSchool(); // 入学申请
    abstract void arriving(); // 抵达


}
