package com.bradnon.pattern2.bridge.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 17:07
 */
public class RefineAbstraction extends Abstraction {
    protected RefineAbstraction(Implementor imple) {
        super(imple);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化（RefineAbstraction）角色被访问");
        imple.operationImpl();
    }
}
