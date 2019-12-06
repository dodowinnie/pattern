package com.bradnon.pattern.composite;

import java.util.ArrayList;

public class Folder extends AbstractFile {

    private ArrayList<AbstractFile> fileList = new ArrayList<AbstractFile>();

    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    void killVirus() {
        System.out.println("******对文件夹‘" + name + "’进行杀毒******");
        // 递归调用成员构件的killVirus()方法
        for (AbstractFile file: fileList) {
            file.killVirus();
        }
    }
}
