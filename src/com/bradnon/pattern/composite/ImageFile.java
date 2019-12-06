package com.bradnon.pattern.composite;

public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    void remove(AbstractFile file) {
        System.out.println("对不起，不支持该方法！");
    }

    @Override
    AbstractFile getChild(int i) {
        System.out.println("对不起，不支持该方法！");
        return null;
    }

    @Override
    void killVirus() {
        System.out.println("--------对图像文件‘" + name + "’进行杀毒--------");
    }
}
