package com.bradnon.pattern.facade;

public class CipherMachine {

    public String encrypt(String plainText){
        System.out.println("【数据加密，将明文转换为密文】");
        String es = "";
        char[] chars = plainText.toCharArray();
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            String s = String.valueOf(c % 7);
            es += s;
        }
        return es;
    }
}
