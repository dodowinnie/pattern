package com.bradnon.pattern2.facade.origin;

/**
 * @Description: 外观角色
 * @author: Brandon
 * @date 2021/3/18 14:24
 */
public class Facade {

    private SubSystem01 system01 = new SubSystem01();
    private SubSystem02 system02 = new SubSystem02();
    private SubSystem03 system03 = new SubSystem03();

    public void method(){
        system01.method01();
        system02.method02();
        system03.method03();
    }

}
