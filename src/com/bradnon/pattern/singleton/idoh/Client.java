package com.bradnon.pattern.singleton.idoh;

public class Client {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}
