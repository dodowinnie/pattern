package com.bradnon.pattern2.bridge.origin;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 具体实现化角色
 * @author: Brandon
 * @date 2021/3/17 17:01
 */
public class ConcreteImplemetorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化（ConcreteImplemetorA）角色被访问");
    }


}
