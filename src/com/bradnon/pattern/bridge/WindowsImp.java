package com.bradnon.pattern.bridge;

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint() {
        System.out.println("在Windows操作系统中显示图像：");
    }
}
