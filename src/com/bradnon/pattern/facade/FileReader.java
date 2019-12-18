package com.bradnon.pattern.facade;

import java.io.*;

public class FileReader {

    public String read(String filePath){
        InputStream ins = null;
        StringBuilder sb = new StringBuilder();
        try {
            ins = new FileInputStream(filePath);
            int i = 0;
            while((i = ins.read()) != -1){
                sb.append((char)i);
            }
            System.out.println(sb.toString());
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            if(ins != null){
                try {
                    ins.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
