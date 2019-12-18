package com.bradnon.pattern.facade;

public class Client {
    public static void main(String[] args) {
        String src = "D:\\opt\\pattern\\facade.txt";
        String dest = "D:\\opt\\pattern\\password.txt";
        EncryptFacade facade = new EncryptFacade();
        facade.password(src, dest);
    }
}
