package com.bradnon.pattern.bridge.maobi;

public class BigMaoBi extends MaoBi {
    @Override
    void doPaint() {
        color.doColor();
        System.out.println("这是大号毛笔~~~~~~~~~~~~");
    }
}
