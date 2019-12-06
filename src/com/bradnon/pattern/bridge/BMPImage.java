package com.bradnon.pattern.bridge;

public class BMPImage extends Image {
    @Override
    public void parseFile(String fileName) {
        imp.doPaint();
        System.out.println(fileName + ", 格式为BMP");
    }
}
