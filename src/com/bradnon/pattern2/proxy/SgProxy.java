package com.bradnon.pattern2.proxy;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 14:15
 */
public class SgProxy implements Specialty {

    private WySpecialty wySpecialty = new WySpecialty();

    @Override
    public void display() {
        before();
        wySpecialty.display();
        after();
    }

    public void before(){
        System.out.println("代理开始工作。。。。");
    }

    public void  after(){
        System.out.println("代理结束工作。。。。");
    }

}
