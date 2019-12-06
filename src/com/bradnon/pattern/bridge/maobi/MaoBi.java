package com.bradnon.pattern.bridge.maobi;

public abstract class MaoBi {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    abstract void doPaint();
}
