package com.bradnon.pattern.bridge.maobi;

public class Client {

    public static void main(String[] args) {
        Color color = new Blue();
        MaoBi maoBi = new MiddleMaoBi();
        maoBi.setColor(color);
        maoBi.doPaint();
    }
}
