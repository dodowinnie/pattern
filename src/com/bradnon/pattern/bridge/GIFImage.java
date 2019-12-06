package com.bradnon.pattern.bridge;

public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        imp.doPaint();
        System.out.println(fileName + ", 格式为GIF");
    }
}
