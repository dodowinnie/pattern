package com.bradnon.pattern.bridge.maobi;

public class SmallMaoBi extends MaoBi {
    @Override
    void doPaint() {
        color.doColor();
        System.out.println("这是消耗毛笔~~~~~~~~~~~");
    }
}
