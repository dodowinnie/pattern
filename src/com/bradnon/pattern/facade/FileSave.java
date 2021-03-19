package com.bradnon.pattern.facade;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileSave {

    public void wirte(String encryptStr, String filePath){
        OutputStream os = null;
        try {
            os = new FileOutputStream(filePath);
            byte[] bytes = encryptStr.getBytes();
            os.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
