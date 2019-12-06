package com.bradnon.pattern.bridge;

public class Client {
    public static void main(String[] args) {
        ImageImp imp = new WindowsImp();
        Image image = new JPGImage();
        image.setImp(imp);
        image.parseFile("brandon");
    }
}
