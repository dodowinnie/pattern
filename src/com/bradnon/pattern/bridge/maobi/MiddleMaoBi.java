package com.bradnon.pattern.bridge.maobi;

public class MiddleMaoBi extends MaoBi {
    @Override
    void doPaint() {
        color.doColor();
        System.out.println("这是中号毛笔~~~~~~~~~~~");
    }
}
