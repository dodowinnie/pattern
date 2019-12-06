package com.bradnon.pattern.composite;

public class Client {

    public static void main(String[] args) {
        AbstractFile file1, file2, file3, file4,file5,folder1,folder2,folder3,folder4;
        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");

        file1 = new ImageFile("brandon.jpg");
        file2 = new ImageFile("Lily.png");
        file3 = new TextFile("九阳神功.txt");
        file4 = new TextFile("乾坤大挪移");
        file5 = new VideoFile("咏春拳.mkv");

        folder2.add(file1);
        folder2.add(file2);
        folder3.add(file3);
        folder3.add(file4);
        folder4.add(file5);

        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder3);
        folder1.add(folder4);

//        folder1.killVirus();
        folder3.killVirus();


    }
}
