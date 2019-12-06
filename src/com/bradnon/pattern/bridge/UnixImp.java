package com.bradnon.pattern.bridge;

public class UnixImp implements ImageImp {
    @Override
    public void doPaint() {
        System.out.println("在Unix操作系统中显示图像：");
    }
}
