package com.bradnon.pattern.bridge;

public class LinuxImp implements ImageImp {
    @Override
    public void doPaint() {
        System.out.println("在Linux操作系统中显示图像：");
    }
}
