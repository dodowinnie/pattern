package com.bradnon.pattern.adapter.test;

public class Client {

    public static void main(String[] args) {
        TargetOperation operation = new Adpater();
        operation.request();
    }
}
